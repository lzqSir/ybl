package com.ybl.om.controller;

import com.ybl.om.dao.mapper.user.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class OrderController {

    @Resource
    private UserMapper userMapper;

    @RequestMapping("/order.do")
    @ResponseBody
    public String helloOM(HttpServletRequest request, HttpServletResponse response){

       // final User user = userMapper.selectByPrimaryKey(5L);
        //System.out.println(user);
        return "hahahahhahahaha!!!!";


    }
}
