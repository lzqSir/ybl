package com.ybl.om.dao;

import com.ybl.om.model.Carpark;

public interface CarparkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Carpark record);

    int insertSelective(Carpark record);

    Carpark selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Carpark record);

    int updateByPrimaryKey(Carpark record);
}