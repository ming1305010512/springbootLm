package com.alsa.alsa.springbootFeatures.developingWebApplications.errorHandling;

import org.springframework.http.HttpStatus;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/29
 * @Time:14:57
 */
public class CustomErrorType {

    private Integer statusValue;
    private String message;

    public CustomErrorType(Integer statusValue, String message) {
        this.statusValue = statusValue;
        this.message = message;
    }

    public Integer getStatusValue() {
        return statusValue;
    }

    public void setStatusValue(Integer statusValue) {
        this.statusValue = statusValue;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
