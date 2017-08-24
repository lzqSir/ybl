package com.ybl.om.model.common;

import java.util.Locale;
import java.util.StringTokenizer;

/**
 * 
 * @author HuangFu
 *
 */
public abstract class AbstractPaginationSqlCreator implements PaginationSqlCreator {

	 public String getCountSql(String sql){
		 String lowsql=sql.toUpperCase(Locale.ENGLISH);
		 int h=lowsql.indexOf(" FROM ");
		 if(h==-1)
			 throw new RuntimeException("can not find 'FROM' key words! sql:"+sql);
		 StringBuilder sbl1=new StringBuilder(sql.length());
		 sbl1.append("SELECT COUNT(*)");
		 
		 int oderBy=findOrderBy(lowsql);
		 boolean f=false;
		 if(oderBy!=-1){
			 int x=lowsql.indexOf(')', oderBy);
			 if(x==-1){
				f=true; 
			 }
		 }
		 
		 if(f){
			 sbl1.append(sql.substring(h, oderBy));
		 }else{
			 sbl1.append(sql.substring(h, sql.length()));
		 }
		 
		 
		//return new StringBuilder(sql.length()).append("SELECT COUNT(*)").append().toString();
		 return sbl1.toString();
	 }
	 
	 private static int findOrderBy(String sql){
		 int h=sql.lastIndexOf(" ORDER ");
		 if(h==-1)
			 return h;
		 String v1=sql.substring(h,sql.length());
		 StringTokenizer st=new StringTokenizer(v1);
		 st.nextToken();
		 boolean isBy=false;
		 while(st.hasMoreTokens()){
             if("BY".equals(st.nextToken())){
				 isBy=true;
			 }
			 break;
		 }
		 
		 if(isBy){
			 return h;
		 }else{
			 return findOrderBy(sql.substring(0,h));
		 }

	 }
	 
	 
//	 public static void main(String[] args){
//		String sql="select * from x x1 ,(select id from g where as='1' order  by xg) v where x1.a=1 and x1.id=v.id order by xfdss";
//		AbstractPaginationSqlCreator c=new AbstractPaginationSqlCreator(){
//
//			@Override
//			public String getPaginationSql(String sql, Pagination pagination) {
//				// TODO Auto-generated method stub
//				return null;
//			}};
//		
//		System.out.println(c.getCountSql(sql));
//
//	 }
	 
	 
	 

}
