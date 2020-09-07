package com.alsa.configuration.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/28
 * @Time:10:50
 */
@Configuration(proxyBeanMethods = false)
@Profile("production")
public class ProductionConfiguration {

}
