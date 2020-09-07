package com.alsa.alsa.springbootFeatures.profiles;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/28
 * @Time:11:09
 */
@ConfigurationProperties("profiles")
public class Profiles {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Profiles{" +
                "name='" + name + '\'' +
                '}';
    }
}
