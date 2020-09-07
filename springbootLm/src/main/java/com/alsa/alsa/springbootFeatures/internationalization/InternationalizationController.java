package com.alsa.alsa.springbootFeatures.internationalization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/28
 * @Time:16:02
 */
@RestController
@RequestMapping("/internationalization")
public class InternationalizationController {

    @Autowired
    private MessageSourceHandler messageSourceHandler;

    @RequestMapping("/message")
    public Object i18nTest(){

        // Locale locale = Locale.CHINA;
        Locale locale = Locale.US;
        String message = messageSourceHandler.getMessage("message.name", locale);
        return "属性值"+message;
    }

}
