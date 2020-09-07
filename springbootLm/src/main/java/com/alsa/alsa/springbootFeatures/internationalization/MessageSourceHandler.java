package com.alsa.alsa.springbootFeatures.internationalization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/28
 * @Time:15:53
 */
@Component
public class MessageSourceHandler {

    @Autowired
    private MessageSource messageSource;

    public String getMessage(String messageKey, Locale locale){
        String message = messageSource.getMessage(messageKey, null, locale);
        return message;
    }
}
