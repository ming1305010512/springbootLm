package com.alsa.alsa.springbootFeatures.workingWithSqlDatabases.usingJdbcTemplate;

import com.alsa.alsa.springbootFeatures.workingWithSqlDatabases.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/30
 * @Time:16:08
 */
@Component
public class JdbcTemplateService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> queryUser(String userName){
        String sql = " select user_id userId,user_name userName from sys_user where user_name = ?";
        List<User> userList = jdbcTemplate.query(sql,(resultSet,rowNum)->{
            User user = new User();
            user.setUserName(resultSet.getString("userName"));
            user.setUserId(resultSet.getLong("userId"));
            return user;
        },userName);
        return userList;
    }
}
