package com.alsa.alsa.springbootFeatures.workingWithSqlDatabases.service.impl;

import com.alsa.alsa.springbootFeatures.workingWithSqlDatabases.dto.User;
import com.alsa.alsa.springbootFeatures.workingWithSqlDatabases.jpaAndSpringDataJpa.City;
import com.alsa.alsa.springbootFeatures.workingWithSqlDatabases.jpaAndSpringDataJpa.CityRepository;
import com.alsa.alsa.springbootFeatures.workingWithSqlDatabases.mapper.SysUserMapper;
import com.alsa.alsa.springbootFeatures.workingWithSqlDatabases.service.ISqlDataBasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/30
 * @Time:11:11
 */
@Service
public class SqlDataBasesServiceImpl implements ISqlDataBasesService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<User> queryUser(User user) {
        List<User> userList = sysUserMapper.selectUser(user);
        return userList;
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED, rollbackFor=Exception.class)
    public int updateCity(String cityName, Long cityId) {
        int rowCount = cityRepository.updateCityName(cityName,cityId);
        return rowCount;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public City saveCity(City city) {
        return cityRepository.save(city);
    }


}
