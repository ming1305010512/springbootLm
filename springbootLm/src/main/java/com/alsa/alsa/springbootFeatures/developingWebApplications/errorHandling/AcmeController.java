package com.alsa.alsa.springbootFeatures.developingWebApplications.errorHandling;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/29
 * @Time:14:16
 */
@RestController
@RequestMapping("/errorHandle")
public class AcmeController {

    @RequestMapping("/exception")
    public Object errorHandleTest() throws Exception {
        if (true) {
            throw new Exception("异常处理测试");
        }
        return "成功";
    }
}
