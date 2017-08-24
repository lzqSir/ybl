package com.ybl.om.model.common;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.scripting.defaults.DefaultParameterHandler;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;


/**
 * 
 * @author HuangFu
 *
 */
@Intercepts({@Signature(type=Executor.class,method="query",args={MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class })}) 
public class PaginationInterceptor implements Interceptor{

	private PaginationSqlCreator paginationSqlCreator;

	private static Log log=LogFactory.getLog(PaginationInterceptor.class);
	
	public PaginationSqlCreator getPaginationSqlCreator() {
		if(paginationSqlCreator==null){
			paginationSqlCreator=new MysqlPaginationSqlCreator();
		}
		return paginationSqlCreator;
	}

	public void setPaginationSqlCreator(PaginationSqlCreator paginationSqlCreator) {
		this.paginationSqlCreator = paginationSqlCreator;
	}

	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		Object[] args=invocation.getArgs();
		if(args!=null&&args.length>=2&& invocation.getTarget() instanceof Executor){
			RowBounds rowBounds = (RowBounds)args[2]; 
			if(rowBounds!=null){
				if(rowBounds instanceof Pagination){
					MappedStatement mappedStatement=(MappedStatement)invocation.getArgs()[0];         
				    Object parameter = invocation.getArgs()[1];   
				    BoundSql boundSql = mappedStatement.getBoundSql(parameter);   
				    String originalSql = boundSql.getSql();
				    
				    Object parameterObject = boundSql.getParameterObject();  
			        if(boundSql!=null&&boundSql.getSql()!=null&&boundSql.getSql().length()>0){
			        	StringBuilder sbr=new StringBuilder(originalSql.length());
					    StringTokenizer sba = new StringTokenizer(originalSql, " \n\r\t");
					    char bz=' ';
					    while(sba.hasMoreElements()){
					    	if(sbr.length()>0){
					    		sbr.append(bz);
					    	}
					    	sbr.append(sba.nextElement());
					    }
					    originalSql=sbr.toString(); //去掉换行等字符串
			        	Pagination p=(Pagination)rowBounds;
			        	if(p.isNeedQueryCount()){
			        		//如果需要查询总数
			        		String countSql=getPaginationSqlCreator().getCountSql(originalSql);
			        		Connection connection=((Executor)invocation.getTarget()).getTransaction().getConnection(); //从当前事务中获取connection //mappedStatement.getConfiguration().getEnvironment().getDataSource().getConnection();
			        		PreparedStatement ps=connection.prepareStatement(countSql);
			        		BoundSql countBS = new BoundSql(mappedStatement.getConfiguration(),countSql,boundSql.getParameterMappings(),parameterObject);
			        		Field afiled=boundSql.getClass().getDeclaredField("additionalParameters");
			        		if(!afiled.isAccessible()){
			        			afiled.setAccessible(true);
			        		}
			        		Map<?, ?> additionalParameters=(Map<?, ?>)afiled.get(boundSql);
			        		if(additionalParameters!=null&&!additionalParameters.isEmpty()){
			        		   for(Map.Entry<?, ?> e:additionalParameters.entrySet()){
			        			   countBS.setAdditionalParameter((String)e.getKey(), e.getValue());
			        		   }
			        		}
			        		
			        		
			        		if(log.isDebugEnabled()){
								log.debug("==>  Preparing: "+countSql);
							}
			        		DefaultParameterHandler parameterHandler = new DefaultParameterHandler(mappedStatement, parameterObject, countBS);  
			        	    parameterHandler.setParameters(ps); 
			        		
			        		//setParameters(ps,mappedStatement,countBS,parameterObject);  
							long count=0;
							ResultSet result=ps.executeQuery();
							while(result.next()){
								count=result.getLong(1);
							}
							result.close();
							ps.close();
							p.setRecordsCount(count);//设置查询结果
							if(log.isDebugEnabled()){
								log.debug("<==      COUNT: "+count);
							}
			        	}
			        	
			        	p.calculatePage();
			        	String pagesql=getPaginationSqlCreator().getPaginationSql(originalSql,p);  
			        	invocation.getArgs()[2] = new RowBounds(RowBounds.NO_ROW_OFFSET, RowBounds.NO_ROW_LIMIT); //不需要使用mybatis的自带分页
			        	BoundSql newBoundSql = copyFromBoundSql(mappedStatement, boundSql, pagesql);
			        	MappedStatement newMs = copyFromMappedStatement(mappedStatement,new BoundSqlSqlSource(newBoundSql)); 
			        	invocation.getArgs()[0]= newMs;
			        }
			    }
			}else{
				invocation.getArgs()[2]=new RowBounds(RowBounds.NO_ROW_OFFSET, RowBounds.NO_ROW_LIMIT);
			}
		}
		
		
		
        return invocation.proceed();
	}
	
	 
	public static class BoundSqlSqlSource implements SqlSource {    
       BoundSql boundSql;    
       public BoundSqlSqlSource(BoundSql boundSql) {    
          this.boundSql = boundSql;    
       }    
       public BoundSql getBoundSql(Object parameterObject) {    
          return boundSql;    
       }    
	} 
  
	
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	private void setParameters(PreparedStatement ps,MappedStatement mappedStatement,BoundSql boundSql,Object parameterObject) throws SQLException {    
//        ErrorContext.instance().activity("setting parameters").object(mappedStatement.getParameterMap().getId());    
//        List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();    
//        StringBuilder logburder=null;
//        if(log.isDebugEnabled()){
//        	logburder=new StringBuilder(128);
//        }
//        if (parameterMappings != null) {    
//            Configuration configuration = mappedStatement.getConfiguration();    
//            TypeHandlerRegistry typeHandlerRegistry = configuration.getTypeHandlerRegistry();    
//            MetaObject metaObject = parameterObject == null ? null: configuration.newMetaObject(parameterObject);    
//           
//            for (int i = 0; i < parameterMappings.size(); i++) {    
//                ParameterMapping parameterMapping = parameterMappings.get(i);    
//                if (parameterMapping.getMode() != ParameterMode.OUT) {    
//                    Object value;    
//                    String propertyName = parameterMapping.getProperty();    
//                    PropertyTokenizer prop = new PropertyTokenizer(propertyName);    
//                    if (parameterObject == null) {    
//                        value = null;    
//                    } else if (typeHandlerRegistry.hasTypeHandler(parameterObject.getClass())) {    
//                        value = parameterObject;    
//                    } else if (boundSql.hasAdditionalParameter(propertyName)) {    
//                        value = boundSql.getAdditionalParameter(propertyName);    
//                    } else if (propertyName.startsWith(ForEachSqlNode.ITEM_PREFIX)&& boundSql.hasAdditionalParameter(prop.getName())) {    
//                        value = boundSql.getAdditionalParameter(prop.getName());    
//                        if (value != null) {    
//                            value = configuration.newMetaObject(value).getValue(propertyName.substring(prop.getName().length()));    
//                        }    
//                    } else {    
//                        value = metaObject == null ? null : metaObject.getValue(propertyName);    
//                    }    
//                    TypeHandler typeHandler = parameterMapping.getTypeHandler();    
//                    if (typeHandler == null) {    
//                        throw new ExecutorException("There was no TypeHandler found for parameter "+ propertyName + " of statement "+ mappedStatement.getId());    
//                    }    
//                    typeHandler.setParameter(ps, i + 1, value, parameterMapping.getJdbcType()); 
//                    
//                    if(logburder!=null){
//                    	if(logburder.length()>0){
//                    		logburder.append(',').append(' ');
//                    	}
//                    	if (value == null) {
//                    		  logburder.append("null");
//                        } else {
//                        	  logburder.append(value);
//                        	  logburder.append('(');
//                        	  logburder.append(value.getClass().getSimpleName());
//                        	  logburder.append(')');
//                         }
//                    	
//                    	
//                    }
//                }    
//            }
//            
//            
//        } 
//        
//        if(log.isDebugEnabled()){
//        	log.debug("==> Parameters: " + (logburder==null?"":logburder.toString()));
//        }
//    }   
	

	@Override
	public Object plugin(Object arg0) {
		 return Plugin.wrap(arg0, this);  
	}

	@Override
	public void setProperties(Properties arg0) {
		
	}
	
	
	 private BoundSql copyFromBoundSql(MappedStatement ms, BoundSql boundSql, String sql) {  
	    BoundSql newBoundSql = new BoundSql(ms.getConfiguration(),sql, boundSql.getParameterMappings(), boundSql.getParameterObject());  
	    for (ParameterMapping mapping : boundSql.getParameterMappings()) {  
	        String prop = mapping.getProperty();  
	        if (boundSql.hasAdditionalParameter(prop)) {  
	            newBoundSql.setAdditionalParameter(prop, boundSql.getAdditionalParameter(prop));  
	        }  
	    }  
	    return newBoundSql;  
	}  
	 
	 private MappedStatement copyFromMappedStatement(MappedStatement ms,SqlSource newSqlSource) {  
		   MappedStatement.Builder builder = new MappedStatement.Builder(ms.getConfiguration(),ms.getId(),newSqlSource,ms.getSqlCommandType());  
		    
		    builder.resource(ms.getResource());
		    builder.fetchSize(ms.getFetchSize()); 
		    builder.timeout(ms.getTimeout());
		    builder.statementType(ms.getStatementType()); 
		    builder.resultSetType(ms.getResultSetType());
		    builder.cache(ms.getCache()); 
		    builder.useCache(ms.isUseCache());  
		    builder.parameterMap(ms.getParameterMap());  
		    builder.resultMaps(ms.getResultMaps()); 
		    builder.lang(ms.getLang());
		    builder.databaseId(ms.getDatabaseId());
		    builder.keyGenerator(ms.getKeyGenerator());  
		    builder.flushCacheRequired(ms.isFlushCacheRequired()); 
		    builder.resultOrdered(ms.isResultOrdered());
		    
		    String[] keyColumns=ms.getKeyColumns();
		    if(keyColumns!=null&&keyColumns.length>0){
		    	StringBuilder sbr=new StringBuilder();
		    	for(String c:keyColumns){
		    		if(sbr.length()>0){
		    			sbr.append(",");
		    		}
		    		sbr.append(c);
		    	}
		    	if(sbr.length()>0){
		    		builder.keyColumn(sbr.toString());
		    	}
		    }

		    String[] keyProperties=ms.getKeyProperties();
		    if(keyProperties!=null&&keyProperties.length>0){
		    	StringBuilder sbr=new StringBuilder();
		    	for(String c:keyProperties){
		    		if(sbr.length()>0){
		    			sbr.append(",");
		    		}
		    		sbr.append(c);
		    	}
		    	if(sbr.length()>0){
		    		builder.keyProperty(sbr.toString());
		    	}
		    }
		    
		  
	        String[] resulSets=ms.getResulSets();
	        if(resulSets!=null&&resulSets.length>0){
		    	StringBuilder sbr=new StringBuilder();
		    	for(String c:resulSets){
		    		if(sbr.length()>0){
		    			sbr.append(",");
		    		}
		    		sbr.append(c);
		    	}
		    	if(sbr.length()>0){
		    		builder.resulSets(sbr.toString());
		    	}
		    }
		   
	 
		    return builder.build();  
	}  
	 


	
	
}
