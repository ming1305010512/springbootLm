package com.alsa.account.service.impl;

import com.alsa.account.dto.User;
import com.alsa.account.mapper.UserMapper;
import com.alsa.account.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import sample.custom.PasswordManager;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/9/7
 * @Time: 16:13
 * @Description:
 */
public class UserServiceImpl implements IUserService {

    private UserMapper userMapper;

    private PasswordEncoder passwordEncoder;

    @Override
    public User selectByUserName(String userName) {
        return userMapper.selectByUserName(userName);
    }

    @Override
    public User createUser(User user) {
        //编码密码
        user.setPasswordEncrypted(passwordEncoder.encode(user.getPasswordEncrypted()));
        userMapper.insertUser(user);
        return user;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }
}
