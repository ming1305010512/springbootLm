package com.alsa.alsa.springbootFeatures.workingWithSqlDatabases.mapper;

import com.alsa.alsa.springbootFeatures.workingWithSqlDatabases.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/30
 * @Time:11:03
 */
@Mapper
public interface SysUserMapper {
    /**
     * 查询用户信息
     * @param user
     * @return
     */
    List<User> selectUser(User user);
}
