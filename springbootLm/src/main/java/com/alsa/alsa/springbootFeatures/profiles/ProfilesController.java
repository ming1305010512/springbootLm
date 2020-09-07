package com.alsa.alsa.springbootFeatures.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.java2d.cmm.Profile;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/28
 * @Time:11:08
 */
@RestController
@RequestMapping("/profiles")
public class ProfilesController {

    @Autowired
    private Profiles profiles;

    @RequestMapping("/name")
    public Object propertyTest(){
        return "属性值"+profiles;
    }
}
