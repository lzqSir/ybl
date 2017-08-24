package com.ybl.om.dao.mapper.user;

import com.ybl.om.model.user.Role;

import java.util.List;
import java.util.Map;

public interface RoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long id);

    List<Role> selectRoleList(Map<String,Object> paramMap);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}