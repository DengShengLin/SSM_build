package com.deng.controller;

import com.deng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author DengShenglin
 *
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public String findAll(){
        System.out.printf("表现层。返回所有用户信息。。。");
        userService.findAll();
        return "list";
    }

}
