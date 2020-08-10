package com.alsa.alsa.springbootFeatures.workingWithSqlDatabases.controller;

import com.alsa.alsa.springbootFeatures.workingWithSqlDatabases.dto.User;
import com.alsa.alsa.springbootFeatures.workingWithSqlDatabases.jpaAndSpringDataJpa.City;
import com.alsa.alsa.springbootFeatures.workingWithSqlDatabases.jpaAndSpringDataJpa.CityRepository;
import com.alsa.alsa.springbootFeatures.workingWithSqlDatabases.service.ISqlDataBasesService;
import com.alsa.alsa.springbootFeatures.workingWithSqlDatabases.usingJdbcTemplate.JdbcTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/30
 * @Time:11:09
 */
@RestController
@RequestMapping("/sqlDataBases")
public class SqlDataBasesController {

    @Autowired
    private ISqlDataBasesService sqlDataBasesService;
    @Autowired
    private JdbcTemplateService jdbcTemplateService;
    @Autowired
    private CityRepository cityRepository;

    @RequestMapping("/queryUser")
    public Object queryUser(){
        User user = new User();
        user.setUserName("longming");
        List<User> userList = sqlDataBasesService.queryUser(user);
        return userList;
    }

    @RequestMapping("/jdbcTemplate")
    public Object queryUserByJdbcTemplate(){
        List<User> userList = jdbcTemplateService.queryUser("longming");
        return userList;
    }

    @RequestMapping("/reposity")
    public Object queryCity(){
        City city = cityRepository.findByCityId(10001L);
        return city;
    }
    @RequestMapping("/reposityWithCityName")
    public Object queryCityWithName(){
        List<City> cities = cityRepository.findByCityName("长沙");
        return cities;
    }

    @RequestMapping("/reposityUpdateCityName")
    public Object reposityUpdateCityName(){
        int rowCount = sqlDataBasesService.updateCity("长沙2",10001L);
        return "更新了"+rowCount+"条记录";
    }

    @RequestMapping("/insertCity")
    public Object insertCity(){
        City city = new City("北京","中国");
        return sqlDataBasesService.saveCity(city);
    }

}
