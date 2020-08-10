package com.alsa.alsa.springbootFeatures.springApplication.accessingApplicationArguments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/25
 * @Time:10:27
 */
@Component
public class MyBean {

    @Autowired
    public MyBean(ApplicationArguments args){
        boolean debug = args.containsOption("debug");
        List<String> files = args.getNonOptionArgs();
        System.out.println("选项为："+debug);
        for (String str: files) {
            System.out.println("包含的参数值为："+str);
        }
    }
}
