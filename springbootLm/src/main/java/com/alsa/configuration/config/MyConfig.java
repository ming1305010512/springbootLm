package com.alsa.configuration.config;

import com.alsa.alsa.springbootFeatures.developingWebApplications.errorHandling.MyErrorPageRegistrar;
import com.alsa.alsa.springbootFeatures.developingWebApplications.errorHandling.MyErrorViewResolver;
import com.alsa.alsa.springbootFeatures.externalizedConfiguration.MyBean2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.StringRedisConnection;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/25
 * @Time:17:22
 */
@Configuration
//@ConditionalOnClass(MyBean2.class)
public class MyConfig {

    @Bean
    /**
     * ApplicationContext中没有MyBean2的话创建该bean
     */
//    @ConditionalOnMissingClass
    public MyBean2 getMyBean2() {
        return new MyBean2();
    }


    /**
     * 错误视图解析器
     *
     * @return
     */
    @Bean
    public ErrorViewResolver getErrorViewResolver() {
        return new MyErrorViewResolver();
    }

    /**
     * 错误页注册
     *
     * @return
     */
    @Bean
    public ErrorPageRegistrar errorPageRegistrar() {
        return new MyErrorPageRegistrar();
    }

    /**
     * 连接redis
     *
     * @return
     */
    @Bean
    public LettuceConnectionFactory redisConnectionFactory() {
        RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration("192.168.1.130", 6379);
        return new LettuceConnectionFactory(configuration);
    }

    /**
     * 注册RedisTemplate
     *
     * @return
     */
    @Bean
    public StringRedisTemplate stringRedisTemplate() {
        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate();
        stringRedisTemplate.setConnectionFactory(redisConnectionFactory());
        return stringRedisTemplate;
    }

}
