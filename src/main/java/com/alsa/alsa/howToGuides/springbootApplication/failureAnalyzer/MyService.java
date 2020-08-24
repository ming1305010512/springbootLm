package com.alsa.alsa.howToGuides.springbootApplication.failureAnalyzer;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/8/24
 * @Time: 10:42
 * @Description:
 */
@Service
public class MyService {
    @Resource(name = "myDAO")
//    private MyDAO myDAO;
    private MySecondDAO myDAO;
}
