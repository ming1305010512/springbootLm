package com.alsa.alsa.springbootFeatures.workingWithSqlDatabases.service;

import com.alsa.alsa.springbootFeatures.workingWithSqlDatabases.dto.User;
import com.alsa.alsa.springbootFeatures.workingWithSqlDatabases.jpaAndSpringDataJpa.City;

import java.util.List;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/30
 * @Time:11:11
 */
public interface ISqlDataBasesService {

    /**
     * 查询用户信息
     *
     * @param user
     * @return
     */
    List<User> queryUser(User user);

    /**
     * 更新城市
     *
     * @param cityName
     * @param cityId
     * @return
     */
    int updateCity(String cityName, Long cityId);

    /**
     * 保存城市
     *
     * @param city
     * @return
     */
    City saveCity(City city);
}
