package com.alsa.configuration.config;

import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.builders.WebSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/8/1
 * @Time:11:11
 */
@Configuration(proxyBeanMethods = false)
public class ActuatorSecurity{

// extends WebSecurityConfigurerAdapter {
    // @Override
    // protected void configure(HttpSecurity http) throws Exception {
    //     //TODO 没弄明白这是怎么回事
    //     http.authorizeRequests((request)->{
    //         request.anyRequest().permitAll();
    //     });
    //     http.httpBasic();
    // }
}
