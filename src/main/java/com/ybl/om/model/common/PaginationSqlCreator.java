package com.ybl.om.model.common;


/**
 * 分页Sql创建工厂
 * @author HuangFu
 *
 */
public interface PaginationSqlCreator {
	
    public  String getCountSql(String sql);
	
	public  String getPaginationSql(String sql, Pagination pagination);
}
