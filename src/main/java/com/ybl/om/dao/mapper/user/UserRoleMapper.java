package com.ybl.om.dao.mapper.user;

import com.ybl.om.model.user.UserRole;

import java.util.List;
import java.util.Map;

public interface UserRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Long id);

    List<UserRole> selectUserRoleList(Map<String,Object> paramMap);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}