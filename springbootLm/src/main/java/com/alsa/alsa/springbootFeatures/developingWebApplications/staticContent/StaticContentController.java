package com.alsa.alsa.springbootFeatures.developingWebApplications.staticContent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/29
 * @Time:11:27
 */
@Controller
@RequestMapping("/staticContent")
public class StaticContentController {

    @RequestMapping("/index")
    public String propertyTest(){
        return "index";
    }
}
