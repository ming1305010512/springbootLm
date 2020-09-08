package com.alsa.account.service;

import com.alsa.account.dto.User;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/9/7
 * @Time: 16:12
 * @Description:
 */
public interface IUserService {

    /**
     * 根据用户名查询用户
     *
     * @param userName
     * @return
     */
    User selectByUserName(String userName);

    /**
     * 创建用户
     *
     * @param user
     * @return
     */
    User createUser(User user);
}
