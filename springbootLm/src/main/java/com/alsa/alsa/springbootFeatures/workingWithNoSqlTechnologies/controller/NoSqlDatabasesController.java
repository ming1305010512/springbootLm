package com.alsa.alsa.springbootFeatures.workingWithNoSqlTechnologies.controller;

import com.alsa.alsa.springbootFeatures.workingWithNoSqlTechnologies.service.RedisTemplateTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/31
 * @Time:20:15
 */
@RestController
@RequestMapping("/noSqlDatabase")
public class NoSqlDatabasesController {

    @Autowired
    private RedisTemplateTestService redisTemplateTestService;

    @RequestMapping("/redisTemplatePop")
    public Object redisTemplatePop(){
        String userName = redisTemplateTestService.popUserName("10001");
        return userName;
    }

    @RequestMapping("/redisTemplatePush")
    public Object redisTemplatePush(){
        redisTemplateTestService.pushUserName("10002","longming");
        return "加入成功";
    }
}
