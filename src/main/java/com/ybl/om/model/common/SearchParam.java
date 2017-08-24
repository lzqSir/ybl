package com.ybl.om.model.common;

import java.util.ArrayList;
import java.util.Collection;

public class SearchParam implements java.io.Serializable {

    private static final long serialVersionUID = -3260895387097402270L;

    private ArrayList<KeyValue<String, Object>> propertysEqual;
    private ArrayList<KeyValue<String, Object>> propertysNotEqual;
    private ArrayList<KeyValue<String, String>> propertysLike;
    private ArrayList<KeyValue<String, String>> propertysLeftLike;
    private ArrayList<KeyValue<String, String>> propertysRightLike;
    private ArrayList<KeyValue<String, Object>> propertysGT;
    private ArrayList<KeyValue<String, Object>> propertysGTE;
    private ArrayList<KeyValue<String, Object>> propertysLT;
    private ArrayList<KeyValue<String, Object>> propertysLTE;
    private ArrayList<KeyValue<String, ArrayList<Object>>> propertysIn;
    private ArrayList<KeyValue<String, ArrayList<Object>>> propertysNotIn;
    private String whereString;
    private String physical_table_name;
    private String order_by;
    private String group_by;
    private String limit;
    private ArrayList<String> selectFields;
    private String dbid;

    public void clear() {
        propertysEqual = null;
        propertysNotEqual = null;
        propertysLike = null;
        propertysGT = null;
        propertysGTE = null;
        propertysLT = null;
        propertysLTE = null;
        propertysIn = null;
        propertysNotIn = null;
        whereString = null;
        physical_table_name = null;
        order_by = null;
        group_by = null;
        selectFields = null;
        limit = null;
        dbid = null;
        propertysLeftLike = null;
        propertysRightLike = null;
    }

    public void copyTo(SearchParam common) {
        if (propertysEqual != null) {
            common.propertysEqual = new ArrayList<KeyValue<String, Object>>(propertysEqual);
        }

        if (propertysNotEqual != null) {
            common.propertysNotEqual = new ArrayList<KeyValue<String, Object>>(propertysNotEqual);
        }

        if (propertysLike != null) {
            common.propertysLike = new ArrayList<KeyValue<String, String>>(propertysLike);
        }

        if (propertysGT != null) {
            common.propertysGT = new ArrayList<KeyValue<String, Object>>(propertysGT);
        }

        if (propertysGTE != null) {
            common.propertysGTE = new ArrayList<KeyValue<String, Object>>(propertysGTE);
        }

        if (propertysLT != null) {
            common.propertysLT = new ArrayList<KeyValue<String, Object>>(propertysLT);
        }

        if (propertysLTE != null) {
            common.propertysLTE = new ArrayList<KeyValue<String, Object>>(propertysLTE);
        }

        if (propertysIn != null) {
            common.propertysIn = new ArrayList<KeyValue<String, ArrayList<Object>>>(propertysIn);
        }

        if (propertysNotIn != null) {
            common.propertysNotIn = new ArrayList<KeyValue<String, ArrayList<Object>>>(propertysNotIn);
        }

        common.whereString = whereString;
        common.physical_table_name = physical_table_name;
        common.order_by = order_by;
        common.group_by = group_by;
        common.limit = limit;

        if (selectFields != null) {
            common.selectFields = new ArrayList<String>(selectFields);
        }

        common.dbid = dbid;

        if (propertysLeftLike != null) {
            common.propertysLeftLike = new ArrayList<KeyValue<String, String>>(propertysLeftLike);
        }

        if (propertysRightLike != null) {
            common.propertysRightLike = new ArrayList<KeyValue<String, String>>(propertysRightLike);
        }

    }

    public SearchParam() {

    }

    public SearchParam(String physical_table_name) {
        this.physical_table_name = physical_table_name;
    }

    public SearchParam addQueyField(String field) {
        if (selectFields == null) {
            selectFields = new ArrayList<String>();
        }
        selectFields.add(field);
        return this;
    }

    public SearchParam setTableName(String tableName) {
        physical_table_name = tableName;
        return this;
    }

    public SearchParam setQueryFields(String[] fields) {
        selectFields = new ArrayList<String>(fields.length);
        for (String f : fields) {
            selectFields.add(f);
        }
        return this;
    }

    public SearchParam setGoupbySql(String goupbySql) {
        group_by = goupbySql;
        return this;
    }

    public SearchParam setOrerbySql(String oderbySql) {
        order_by = oderbySql;
        return this;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ArrayList<KeyValue<String, Object>> getPropertysEqual() {
        return propertysEqual;
    }

    public void setPropertysEqual(ArrayList<KeyValue<String, Object>> propertysEqual) {
        this.propertysEqual = propertysEqual;
    }

    public ArrayList<KeyValue<String, Object>> getPropertysNotEqual() {
        return propertysNotEqual;
    }

    public void setPropertysNotEqual(ArrayList<KeyValue<String, Object>> propertysNotEqual) {
        this.propertysNotEqual = propertysNotEqual;
    }

    public ArrayList<KeyValue<String, String>> getPropertysLike() {
        return propertysLike;
    }

    public void setPropertysLike(ArrayList<KeyValue<String, String>> propertysLike) {
        this.propertysLike = propertysLike;
    }

    public ArrayList<KeyValue<String, Object>> getPropertysGT() {
        return propertysGT;
    }

    public void setPropertysGT(ArrayList<KeyValue<String, Object>> propertysGT) {
        this.propertysGT = propertysGT;
    }

    public ArrayList<KeyValue<String, Object>> getPropertysGTE() {
        return propertysGTE;
    }

    public void setPropertysGTE(ArrayList<KeyValue<String, Object>> propertysGTE) {
        this.propertysGTE = propertysGTE;
    }

    public ArrayList<KeyValue<String, Object>> getPropertysLT() {
        return propertysLT;
    }

    public void setPropertysLT(ArrayList<KeyValue<String, Object>> propertysLT) {
        this.propertysLT = propertysLT;
    }

    public ArrayList<KeyValue<String, Object>> getPropertysLTE() {
        return propertysLTE;
    }

    public void setPropertysLTE(ArrayList<KeyValue<String, Object>> propertysLTE) {
        this.propertysLTE = propertysLTE;
    }

    public ArrayList<KeyValue<String, ArrayList<Object>>> getPropertysIn() {
        return propertysIn;
    }

    public void setPropertysIn(ArrayList<KeyValue<String, ArrayList<Object>>> propertysIn) {
        this.propertysIn = propertysIn;
    }

    public ArrayList<KeyValue<String, ArrayList<Object>>> getPropertysNotIn() {
        return propertysNotIn;
    }

    public void setPropertysNotIn(ArrayList<KeyValue<String, ArrayList<Object>>> propertysNotIn) {
        this.propertysNotIn = propertysNotIn;
    }

    public String getWhereString() {
        return whereString;
    }

    public ArrayList<KeyValue<String, String>> getPropertysLeftLike() {
        return propertysLeftLike;
    }

    public void setPropertysLeftLike(ArrayList<KeyValue<String, String>> propertysLeftLike) {
        this.propertysLeftLike = propertysLeftLike;
    }

    public ArrayList<KeyValue<String, String>> getPropertysRightLike() {
        return propertysRightLike;
    }

    public void setPropertysRightLike(ArrayList<KeyValue<String, String>> propertysRightLike) {
        this.propertysRightLike = propertysRightLike;
    }

    public void setWhereString(String whereString) {
        this.whereString = whereString;
    }

    public String getPhysical_table_name() {
        return physical_table_name;
    }

    public void setPhysical_table_name(String physical_table_name) {
        this.physical_table_name = physical_table_name;
    }

    public String getOrder_by() {
        return order_by;
    }

    public void setOrder_by(String order_by) {
        this.order_by = order_by;
    }

    public String getGroup_by() {
        return group_by;
    }

    public void setGroup_by(String group_by) {
        this.group_by = group_by;
    }

    public ArrayList<String> getSelectFields() {
        return selectFields;
    }

    public void setSelectFields(ArrayList<String> selectFields) {
        this.selectFields = selectFields;
    }

    /**
     * AND columnName = value
     *
     * @param columnName
     * @param value
     * @return
     */
    public SearchParam addEQ(String columnName, Object value) {
        if (propertysEqual == null) {
            propertysEqual = new ArrayList<KeyValue<String, Object>>();
        }
        propertysEqual.add(new KeyValue<String, Object>(columnName, value));
        return this;
    }

    /**
     * AND columnName <> value
     *
     * @param columnName
     * @param value
     * @return
     */
    public SearchParam addNotEQ(String columnName, Object value) {
        if (propertysNotEqual == null) {
            propertysNotEqual = new ArrayList<KeyValue<String, Object>>();
        }
        propertysNotEqual.add(new KeyValue<String, Object>(columnName, value));
        return this;
    }

    /**
     * AND columnName LIKE '%value%'
     *
     * @param columnName
     * @param value
     * @return
     */
    public SearchParam addLike(String columnName, String value) {
        if (propertysLike == null) {
            propertysLike = new ArrayList<KeyValue<String, String>>();
        }
        propertysLike.add(new KeyValue<String, String>(columnName, value));
        return this;
    }

    /**
     * AND columnName LIKE '%value'
     *
     * @param columnName
     * @param value
     * @return
     */
    public SearchParam addLeftLike(String columnName, String value) {
        if (propertysLeftLike == null) {
            propertysLeftLike = new ArrayList<KeyValue<String, String>>();
        }
        propertysLeftLike.add(new KeyValue<String, String>(columnName, value));
        return this;
    }

    /**
     * AND columnName LIKE 'value%'
     *
     * @param columnName
     * @param value
     * @return
     */
    public SearchParam addRightLike(String columnName, String value) {
        if (propertysRightLike == null) {
            propertysRightLike = new ArrayList<KeyValue<String, String>>();
        }
        propertysRightLike.add(new KeyValue<String, String>(columnName, value));
        return this;
    }

    /**
     * AND columnName>value
     *
     * @param columnName
     * @param value
     * @return
     */
    public SearchParam addGT(String columnName, Object value) {
        if (propertysGT == null) {
            propertysGT = new ArrayList<KeyValue<String, Object>>();
        }
        propertysGT.add(new KeyValue<String, Object>(columnName, value));
        return this;
    }

    /**
     * AND columnName>=value
     *
     * @param columnName
     * @param value
     * @return
     */
    public SearchParam addGTE(String columnName, Object value) {
        if (propertysGTE == null) {
            propertysGTE = new ArrayList<KeyValue<String, Object>>();
        }
        propertysGTE.add(new KeyValue<String, Object>(columnName, value));
        return this;
    }

    /**
     * AND columnName<value
     *
     * @param columnName
     * @param value
     * @return
     */
    public SearchParam addLT(String columnName, Object value) {
        if (propertysLT == null) {
            propertysLT = new ArrayList<KeyValue<String, Object>>();
        }
        propertysLT.add(new KeyValue<String, Object>(columnName, value));
        return this;
    }

    /**
     * AND columnName<=value
     *
     * @param columnName
     * @param value
     * @return
     */
    public SearchParam addLTE(String columnName, Object value) {
        if (propertysLTE == null) {
            propertysLTE = new ArrayList<KeyValue<String, Object>>();
        }
        propertysLTE.add(new KeyValue<String, Object>(columnName, value));
        return this;
    }

    public SearchParam addINList(String columnName, Object[] invalues) {
        if (propertysIn == null) {
            propertysIn = new ArrayList<KeyValue<String, ArrayList<Object>>>();
        }
        KeyValue<String, ArrayList<Object>> e = null;
        for (KeyValue<String, ArrayList<Object>> e1 : propertysIn) {
            if (e1.getKey().equals(columnName)) {
                e = e1;
                break;
            }
        }

        if (e == null) {
            e = new KeyValue<String, ArrayList<Object>>(columnName, null);
            propertysIn.add(e);
        }

        if (e.getValue() == null) {
            e.setValue(new ArrayList<Object>());
        }

        for (Object obj : invalues) {
            e.getValue().add(obj);
        }
        return this;
    }

    public SearchParam addINList(String columnName, Collection<?> invalues) {
        if (propertysIn == null) {
            propertysIn = new ArrayList<KeyValue<String, ArrayList<Object>>>();
        }
        KeyValue<String, ArrayList<Object>> e = null;
        for (KeyValue<String, ArrayList<Object>> e1 : propertysIn) {
            if (e1.getKey().equals(columnName)) {
                e = e1;
                break;
            }
        }

        if (e == null) {
            e = new KeyValue<String, ArrayList<Object>>(columnName, null);
            propertysIn.add(e);
        }

        if (e.getValue() == null) {
            e.setValue(new ArrayList<Object>());
        }

        e.getValue().addAll(invalues);
        return this;
    }

    /**
     * AND columnName IN (value,...)
     *
     * @param columnName
     * @param value
     * @return
     */
    public SearchParam addIN(String columnName, Object value) {
        if (propertysIn == null) {
            propertysIn = new ArrayList<KeyValue<String, ArrayList<Object>>>();
        }

        KeyValue<String, ArrayList<Object>> e = null;
        for (KeyValue<String, ArrayList<Object>> e1 : propertysIn) {
            if (e1.getKey().equals(columnName)) {
                e = e1;
                break;
            }
        }

        if (e == null) {
            e = new KeyValue<String, ArrayList<Object>>(columnName, null);
            propertysIn.add(e);
        }

        if (e.getValue() == null) {
            e.setValue(new ArrayList<Object>());
        }

        e.getValue().add(value);
        return this;
    }

    /**
     * AND columnName NOT IN (value,...)
     *
     * @param columnName
     * @param value
     * @return
     */
    public SearchParam addNotIN(String columnName, Object value) {
        if (propertysNotIn == null) {
            propertysNotIn = new ArrayList<KeyValue<String, ArrayList<Object>>>();
        }

        KeyValue<String, ArrayList<Object>> e = null;
        for (KeyValue<String, ArrayList<Object>> e1 : propertysNotIn) {
            if (e1.getKey().equals(columnName)) {
                e = e1;
                break;
            }
        }

        if (e == null) {
            e = new KeyValue<String, ArrayList<Object>>(columnName, null);
            propertysNotIn.add(e);
        }

        if (e.getValue() == null) {
            e.setValue(new ArrayList<Object>());
        }

        e.getValue().add(value);
        return this;
    }

    /**
     * AND columnName IN (value,...)
     *
     * @param columnName
     * @param values
     * @return
     */
    public SearchParam setIN(String columnName, String[] values) {
        if (propertysIn == null) {
            propertysIn = new ArrayList<KeyValue<String, ArrayList<Object>>>();
        }

        KeyValue<String, ArrayList<Object>> e = null;
        for (KeyValue<String, ArrayList<Object>> e1 : propertysIn) {
            if (e1.getKey().equals(columnName)) {
                e = e1;
                break;
            }
        }

        if (e == null) {
            e = new KeyValue<String, ArrayList<Object>>(columnName, null);
            propertysIn.add(e);
        }

        ArrayList<Object> sa = new ArrayList<Object>(values.length);
        for (Object obj : values) {
            sa.add(obj);
        }

        e.setValue(sa);
        return this;
    }

    public SearchParam setNotIN(String columnName, String[] values) {
        if (propertysNotIn == null) {
            propertysNotIn = new ArrayList<KeyValue<String, ArrayList<Object>>>();
        }

        KeyValue<String, ArrayList<Object>> e = null;
        for (KeyValue<String, ArrayList<Object>> e1 : propertysNotIn) {
            if (e1.getKey().equals(columnName)) {
                e = e1;
                break;
            }
        }

        if (e == null) {
            e = new KeyValue<String, ArrayList<Object>>(columnName, null);
            propertysNotIn.add(e);
        }

        ArrayList<Object> sa = new ArrayList<Object>(values.length);
        for (Object obj : values) {
            sa.add(obj);
        }

        e.setValue(sa);
        return this;
    }

    public SearchParam setIN(String columnName, Collection<Object> values) {
        if (propertysIn == null) {
            propertysIn = new ArrayList<KeyValue<String, ArrayList<Object>>>();
        }

        KeyValue<String, ArrayList<Object>> e = null;
        for (KeyValue<String, ArrayList<Object>> e1 : propertysIn) {
            if (e1.getKey().equals(columnName)) {
                e = e1;
                break;
            }
        }

        if (e == null) {
            e = new KeyValue<String, ArrayList<Object>>(columnName, null);
            propertysIn.add(e);
        }

        ArrayList<Object> sa;
        if (values instanceof ArrayList) {
            sa = (ArrayList<Object>) values;
        } else {
            sa = new ArrayList<Object>(values);
        }

        e.setValue(sa);
        return this;
    }

    public SearchParam setNotIN(String columnName, Collection<Object> values) {
        if (propertysNotIn == null) {
            propertysNotIn = new ArrayList<KeyValue<String, ArrayList<Object>>>();
        }

        KeyValue<String, ArrayList<Object>> e = null;
        for (KeyValue<String, ArrayList<Object>> e1 : propertysNotIn) {
            if (e1.getKey().equals(columnName)) {
                e = e1;
                break;
            }
        }

        if (e == null) {
            e = new KeyValue<String, ArrayList<Object>>(columnName, null);
            propertysNotIn.add(e);
        }

        ArrayList<Object> sa;
        if (values instanceof ArrayList) {
            sa = (ArrayList<Object>) values;
        } else {
            sa = new ArrayList<Object>(values);
        }

        e.setValue(sa);
        return this;
    }

    public String getDbid() {
        return dbid;
    }

    public void setDbid(String dbid) {
        this.dbid = dbid;
    }

}
