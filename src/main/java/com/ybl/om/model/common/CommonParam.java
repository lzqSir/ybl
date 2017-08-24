package com.ybl.om.model.common;

import java.util.ArrayList;

public class CommonParam extends SearchParam{
	private static final long serialVersionUID = -2774943450099355388L;
	
    private ArrayList<KeyValue<String, Object>> updateKeyValues;
    private ArrayList<String> insertNames;
    private ArrayList<Object> insertValues;

    private Long insertId;//插入返回主键值
    
    private ArrayList<String> updateKeyvalueSqls;
    
    public void clear(){
        super.clear();
    	updateKeyValues=null;
        insertNames=null;
        insertValues=null;
        insertId=null;
        updateKeyvalueSqls=null;
   }
 
    /**
     * 注意所有ArrayList 条件内的值引用保持原有引用
     * @return
     */
    public CommonParam cloneCommonParam(){
    	CommonParam common=new CommonParam();
    	copyTo(common);
    	
    	if(updateKeyValues!=null){
    		common.updateKeyValues=new ArrayList<KeyValue<String, Object>>(updateKeyValues);
    	}
    	
    	if(insertNames!=null){
    		common.insertNames=new ArrayList<String>(insertNames);
    	}
    	
    	if(insertValues!=null){
    		common.insertValues=new ArrayList<Object>(insertValues);
    	}
    	
    	if(insertId!=null){
    		common.insertId=insertId;
    	}
    	
    	if(updateKeyvalueSqls!=null){
    		common.updateKeyvalueSqls=updateKeyvalueSqls;
    	}
    	
    	    	
        return common;
    }
    
	public CommonParam(){
		super();
	}
	
	public CommonParam(String physical_table_name){
		super(physical_table_name);
	}

	/**
	 * 
	 * @param keyvalueSql columnName=value
	 * @return
	 */
	public CommonParam addUpdate(String keyvalueSql){
		if(updateKeyvalueSqls==null){
			updateKeyvalueSqls=new ArrayList<String>();
		}
		updateKeyvalueSqls.add(keyvalueSql);
		return this;
	}
	
	/**
	 * set columnName = value
	 * @param columnName
	 * @param value
	 * @return
	 */
	public CommonParam addUpdate(String columnName,Object value){
		if(updateKeyValues==null){
			updateKeyValues=new ArrayList<KeyValue<String, Object>>();
		}
		updateKeyValues.add(new KeyValue<String,Object>(columnName,value));
		return this;
	}
	
	public CommonParam addInsert(String columnName,Object value){
		if(insertNames==null||insertValues==null){
			insertNames=new ArrayList<String>();
			insertValues=new ArrayList<Object>();
		}
		
		insertNames.add(columnName);
		insertValues.add(value);
		return this;
	}

	
	
	public ArrayList<KeyValue<String, Object>> getUpdateKeyValues() {
		return updateKeyValues;
	}

	public void setUpdateKeyValues(
			ArrayList<KeyValue<String, Object>> updateKeyValues) {
		this.updateKeyValues = updateKeyValues;
	}

	public ArrayList<String> getInsertNames() {
		return insertNames;
	}

	public void setInsertNames(ArrayList<String> insertNames) {
		this.insertNames = insertNames;
	}

	public ArrayList<Object> getInsertValues() {
		return insertValues;
	}

	public void setInsertValues(ArrayList<Object> insertValues) {
		this.insertValues = insertValues;
	}

	public Long getInsertId() {
		return insertId;
	}

	public void setInsertId(Long insertId) {
		this.insertId = insertId;
	}

	public ArrayList<String> getUpdateKeyvalueSqls() {
		return updateKeyvalueSqls;
	}

	public void setUpdateKeyvalueSqls(ArrayList<String> updateKeyvalueSqls) {
		this.updateKeyvalueSqls = updateKeyvalueSqls;
	}

	
	
    

	

	
}
