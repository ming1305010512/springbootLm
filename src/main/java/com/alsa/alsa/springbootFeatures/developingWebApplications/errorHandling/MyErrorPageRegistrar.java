package com.alsa.alsa.springbootFeatures.developingWebApplications.errorHandling;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.http.HttpStatus;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/29
 * @Time:21:10
 * @Descprition: 用于没有使用springmvc的情况
 */
public class MyErrorPageRegistrar implements ErrorPageRegistrar {

    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        registry.addErrorPages(new ErrorPage(HttpStatus.BAD_REQUEST,"/400"));
    }
}
