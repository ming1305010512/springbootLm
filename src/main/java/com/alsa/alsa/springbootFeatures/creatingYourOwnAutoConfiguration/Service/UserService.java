package com.alsa.alsa.springbootFeatures.creatingYourOwnAutoConfiguration.Service;

import org.springframework.stereotype.Component;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/27
 * @Time:17:14
 */
@Component
public class UserService {

    private String name;

    public UserService(String name) {
        this.name = name;
    }

    public UserService() {
    }
}
