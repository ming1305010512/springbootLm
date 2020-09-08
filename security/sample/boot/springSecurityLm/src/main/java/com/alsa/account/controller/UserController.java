package com.alsa.account.controller;

import com.alsa.account.dto.User;
import com.alsa.account.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/9/8
 * @Time: 9:28
 * @Description:
 */
@RestController
@RequestMapping("/sys/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/save")
    public Object saveUser(){
        User user = new User();
        user.setUserId(10008L);
        user.setUserName("xiaoYa");
        user.setPasswordEncrypted("xiaoya123");
        user.setEmail("1653219895@qq.com");
        user.setPhone("15898527503");
        user.setStatus("ACTV");
        user.setCreatedBy(10001L);
        user.setCreationDate(new Date());
        user.setFirstLogin("Y");
        user.setEmployeeId(10007L);
        userService.createUser(user);
        return user;
    }

    @RequestMapping("query")
    public Object queryTest(){
        return "测试成功";
    }
}
