package com.alsa.alsa;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/30
 * @Time:14:56
 * @Description: web.xml配置方式启动spring应用
 */
public class SpringBootStartApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootLmApplication.class);
    }
}
