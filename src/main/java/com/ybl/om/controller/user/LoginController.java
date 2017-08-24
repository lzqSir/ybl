package com.ybl.om.controller.user;

import com.ybl.om.dao.mapper.user.UserMapper;
import com.ybl.om.model.user.User;
import com.ybl.om.shiro.AccountService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Fangln on 2017/8/24.
 */
public class LoginController {

    // 处理用户业务类
    @Autowired
    private AccountService accountService;

    @Resource
    private UserMapper userMapper;
    /***
     * 跳转到登录页面
     *
     * @return
     */
    @RequestMapping(value = "toLogin")
    public String toLogin() {
        // 跳转到/page/login.jsp页面
        return "/login/login";
    }

    /***
     * 实现用户登录
     *
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "login.do")
    public ModelAndView Login(String username, String password) {
        //根据用户名找到用户
        String loginView = "/login/login";
        ModelAndView mav = new ModelAndView();
        User user = accountService.getUserByUserName(username);
        if (user == null) {
            mav.setViewName(loginView);
            mav.addObject("msg", "用户不存在");
            return mav;
        }
        if (!user.getPwd().equals(password)) {
            mav.setViewName(loginView);
            mav.addObject("msg", "账号密码错误");
            return mav;
        }
        SecurityUtils.getSecurityManager().logout(SecurityUtils.getSubject());
        // 登录后存放进shiro token
        UsernamePasswordToken token = new UsernamePasswordToken(user.getLoginName(), user.getPwd());
        Subject subject = SecurityUtils.getSubject();
        subject.login(token);
        // 登录成功后会跳转到successUrl配置的链接，不用管下面返回的链接。
        mav.setViewName("redirect:/index.do");
        return mav;
    }


}
