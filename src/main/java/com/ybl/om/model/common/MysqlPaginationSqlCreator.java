package com.ybl.om.model.common;

/**
 * 
 * @author HuangFu
 *
 */
public class MysqlPaginationSqlCreator extends AbstractPaginationSqlCreator{

	
	public String getPaginationSql(String sql, Pagination pagination) {
		return new StringBuilder(sql.length()+100).append(sql).append(" LIMIT ").append(pagination.getOffset()).append(',').append(pagination.getLimitCount()).toString();
//		return new StringBuilder(sql.length()+100).append("SELECT * FROM ( ")
//		.append(sql).append(" ) rowa LIMIT ").append(pagination.getOffset())
//		.append(',').append(pagination.getLimitCount()).toString();

	}
	
}
