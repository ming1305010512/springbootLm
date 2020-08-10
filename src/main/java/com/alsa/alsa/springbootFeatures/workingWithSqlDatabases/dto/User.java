package com.alsa.alsa.springbootFeatures.workingWithSqlDatabases.dto;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/30
 * @Time:11:04
 */
public class User {

    private Long userId;
    private String userName;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
