package com.alsa.alsa.springbootFeatures.workingWithNoSqlTechnologies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/31
 * @Time:20:08
 */
@Service
public class RedisTemplateTestService {

    @Autowired
    private StringRedisTemplate redisTemplate;

    public void pushUserName(String userId,String userName){
        redisTemplate.opsForList().leftPush(userId,userName);
    }

    public String popUserName(String userId){
        String userName = redisTemplate.opsForList().leftPop(userId);
        return userName;
    }
}
