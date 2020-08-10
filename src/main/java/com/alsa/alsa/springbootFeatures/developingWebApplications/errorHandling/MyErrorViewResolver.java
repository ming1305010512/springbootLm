package com.alsa.alsa.springbootFeatures.developingWebApplications.errorHandling;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/29
 * @Time:15:27
 */
public class MyErrorViewResolver implements ErrorViewResolver {

    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {

        ModelAndView modelAndView = new ModelAndView();
        Integer code = status.value();
        if (code==HttpStatus.NOT_FOUND.value()){
            modelAndView.setViewName("/error/notFind");
        }else if (code==HttpStatus.INTERNAL_SERVER_ERROR.value()){
            modelAndView.setViewName("error/internalServerError");
        }
        return modelAndView;
    }
}
