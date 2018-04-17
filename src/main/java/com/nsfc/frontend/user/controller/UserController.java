package com.nsfc.frontend.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 测试前后端分离
 *
 * @author zhangjiayu zhangjiayu
 * @create 2018/4/17
 */
@Controller
@RequestMapping(value = "userInfo")
public class UserController {

    @RequestMapping(value = "/login.htm", method = RequestMethod.GET)
    public String login(){
        return "index";
    }

}
