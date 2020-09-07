package com.alsa.alsa.springbootFeatures.externalizedConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/25
 * @Time:11:25
 */
public class MyBean2 {
    @Value("${name}")
    private String name;

    // @Value("${debug}")
    private String debug;

    @Value("${description}")
    private String description;

    @Value("${my.servers[0]}")
    private String servers;


    public String getName(){
        System.out.println("属性值："+name);
        return name;
    }

    public String getDebug(){
        return debug;
    }

    public String getDescription(){
        return description;
    }

    public String getServers(){
        return servers;
    }
}
