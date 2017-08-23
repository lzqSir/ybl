package com.ybl.om.dao;

import com.ybl.om.model.UserOrder;

public interface UserOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserOrder record);

    int insertSelective(UserOrder record);

    UserOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserOrder record);

    int updateByPrimaryKey(UserOrder record);
}