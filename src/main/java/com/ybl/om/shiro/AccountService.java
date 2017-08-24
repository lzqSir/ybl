package com.ybl.om.shiro;

import com.ybl.om.dao.mapper.user.*;
import com.ybl.om.model.user.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Fangln on 2017/8/24.
 */
@Service
public class AccountService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserRoleMapper userRoleMapper;

    @Resource
    private RolePermissionMapper rolePermissionMapper;

    @Resource
    private PermissionMapper permissionMapper;

    public User getUserByUserName(String userName) {
        Map<String,Object> paramMap = new HashMap<String,Object>();
        paramMap.put("login_name",userName);
        List<User> users = userMapper.selectUserList(paramMap);
        if(users ==null || users.isEmpty()){
            return null;
        }
        User user = users.get(0);
        return user;
    }

    /***
     * 通过用户名获取权限资源
     *
     * @param userName
     * @return
     */
    public List<Permission> getPermissionsByUserName(String userName) {
        System.out.println("调用");
        User user = getUserByUserName(userName);
        if (user == null) {
            return null;
        }
        List<String> list = new ArrayList<String>();
        // System.out.println(user.getUserRoles().get(0).get);
        //根据用户id找到用户的所有的角色
        Map<String,Object> paramMap = new HashMap<String,Object>();
        paramMap.put("user_ids",user.getId());
        List<UserRole> userRoles =userRoleMapper.selectUserRoleList(paramMap);

        //拿出所有的role_id
        List<Long> role_ids = new ArrayList<Long>();
        for (UserRole userRole:userRoles){
            role_ids.add(userRole.getRoleId());
        }
        //根据role_ids拿到所有的权限资源中间表
        paramMap.clear();
        paramMap.put("role_ids",role_ids);
        List<RolePermission> rolePermissionList = rolePermissionMapper.selectRolePermissionList(paramMap);

        //根据中间表再去找到所有的权限
        //拿出所有的permission_id
        List<Long> permission_ids = new ArrayList<Long>();
        for (RolePermission rolePermission:rolePermissionList) {
            permission_ids.add(rolePermission.getPermissionId());
        }
        paramMap.clear();
        paramMap.put("ids",permission_ids);
        //查询出所有的权限list
        List<com.ybl.om.model.user.Permission> permissionList = permissionMapper.selectPermissionList(paramMap);

        return permissionList;
    }

}
