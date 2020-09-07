package com.alsa.configuration.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/28
 * @Time:15:47
 */
@Configuration
public class InternationalConfig {

    @Value("${spring.messages.basename}")
    private String basename;

    /**
     * MessageSourceAutoConfiguration已经配置了一个messageSource,这里不需要
     */
    // @Bean("messageSource")
    // public ResourceBundleMessageSource getMessageResource(){
    //     ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
    //     messageSource.setBasename(basename);
    //     return messageSource;
    // }

}
