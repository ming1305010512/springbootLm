package com.alsa.alsa.springbootFeatures.externalizedConfiguration.controller;

import com.alsa.alsa.springbootFeatures.externalizedConfiguration.MyBean2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/25
 * @Time:11:30
 */
@RestController
@RequestMapping("/externalizedConfiguration")
public class ExternalizedConfigurationController {

    @Autowired
    private MyBean2 myBean;

    @RequestMapping("/nameTest")
    public Object propertyTest(){
        String name = myBean.getName();
        return "属性值"+name;
    }

    @RequestMapping("/debugTest")
    public Object propertyTest2(){
        String debug = myBean.getDebug();
        return "属性值"+debug;
    }
    @RequestMapping("/descriptionTest")
    public Object propertyTest3(){
        String description = myBean.getDescription();
        return "属性值"+description;
    }
    @RequestMapping("/serversTest")
    public Object propertyTest4(){
        String servers = myBean.getServers();
        return "属性值"+servers;
    }

}
