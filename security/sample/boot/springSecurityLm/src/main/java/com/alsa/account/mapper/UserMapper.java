package com.alsa.account.mapper;

import com.alsa.account.dto.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/9/7
 * @Time: 16:14
 * @Description:
 */
@Mapper
public interface UserMapper {

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
     */
    void insertUser(User user);
}
