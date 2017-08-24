package com.ybl.om.shiro;

import com.ybl.om.model.user.Permission;
import com.ybl.om.model.user.User;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.List;

/**
 * Created by Fangln on 2017/8/24.
 */
public class MyShiroRealm extends AuthorizingRealm {


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection pc) {
        //根据自己系统规则的需要编写获取授权信息，这里为了快速入门只获取了用户对应角色的资源url信息
        String userName = (String) pc.fromRealm(getName()).iterator().next();
        if (userName != null) {
            List<Permission> pers = accountService.getPermissionsByUserName(userName);
            if (pers != null && !pers.isEmpty()) {
                SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
                for (Permission each : pers) {
                    //将权限资源添加到用户信息中
                    info.addStringPermission(each.getPermission_url());
                }
                return info;
            }
        }
        return null;
    }
    /***
     * 获取认证信息
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken at) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) at;
        // 通过表单接收的用户名
        String userName = String.valueOf(token.getUsername());
        if (userName != null ) {
            User user = accountService.getUserByUserName(userName);
            if (user != null) {
                return new SimpleAuthenticationInfo(user.getId(), user.getPwd(), getName());
            }
        }

        return null;
    }

    /**用户的业务类**/
    private AccountService accountService;

    public AccountService getAccountService() {
        return accountService;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

}
