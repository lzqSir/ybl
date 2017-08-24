package com.ybl.om.dao.mapper.common;

import java.util.List;
import java.util.Map;

import com.ybl.om.model.common.CommonParam;
import com.ybl.om.model.common.Pagination;
import org.apache.ibatis.session.ResultHandler;
import org.springframework.stereotype.Repository;


@Repository("commonDao")
public interface CommonDao {

	public List<Map<String,Object>> selectDatas(CommonParam commonParam, Pagination pagination);

	public void selectDatas(CommonParam commonParam, ResultHandler<Map<String, Object>> resultHandler, Pagination pagination);
	
	public long selectDatasCount(CommonParam commonParam);

	public int deleteData(CommonParam commonParam);

	public int insertData(CommonParam commonParam);
	
	public int insertAutoIncData(CommonParam commonParam);
	
	public int updateData(CommonParam commonParam);
	
	
	
}
