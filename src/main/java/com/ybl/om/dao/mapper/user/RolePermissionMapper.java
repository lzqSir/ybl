package com.ybl.om.dao.mapper.user;

import com.ybl.om.model.user.RolePermission;

import java.util.List;
import java.util.Map;

public interface RolePermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    RolePermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RolePermission record);

    int updateByPrimaryKey(RolePermission record);

    List<RolePermission> selectRolePermissionList(Map<String,Object> paramMap);
}