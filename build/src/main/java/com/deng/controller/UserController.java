package com.deng.controller;

import com.deng.domain.User;
import com.deng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String findAll() {
        System.out.printf("表现层。返回所有用户信息。。。");
        userService.findAll();
        return "list";
    }


//    @RequestMapping("/Ajax")
//    public @ResponseBody User Ajax(@RequestBody User user) {
//        System.out.println("Ajax方法执行。。。。");
//        // 客户端发送ajax的请求，传的是json字符串，后端把json字符串封装到user对象中
//        System.out.println(user);
//        //模拟查询数据
//        user.setUsername("maxiongmiong");
//        user.setPassword("9999999");
//        //做响应
//        return user;
//
//    }


    /**
     * 模拟异步请求响应
     */
    @RequestMapping("/Ajax")
    public @ResponseBody
    User Ajax(@RequestBody User user){
        System.out.println("Ajax方法执行了...");
        // 客户端发送ajax的请求，传的是json字符串，后端把json字符串封装到user对象中
        System.out.println(user);
        // 做响应，模拟查询数据库
        user.setUsername("haha");
        user.setPassword("9999999");
        // 做响应
        return user;

    }
}
