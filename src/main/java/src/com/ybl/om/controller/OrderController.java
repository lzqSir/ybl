package src.com.ybl.om.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class OrderController {

    @RequestMapping("/order.do")
    @ResponseBody
    public String helloOM(HttpServletRequest request, HttpServletResponse response){

        return "hahahahhahahaha!!!!";
    }
}
