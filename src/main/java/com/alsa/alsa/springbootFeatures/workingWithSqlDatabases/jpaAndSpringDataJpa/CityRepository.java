package com.alsa.alsa.springbootFeatures.workingWithSqlDatabases.jpaAndSpringDataJpa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/30
 * @Time:17:04
 */
public interface CityRepository extends Repository<City, Long> {

    /**
     * 根据城市id查询城市信息
     *
     * @param cityId
     * @return
     */
    City findByCityId(Long cityId);

    /**
     * 根据城市名称查询城市信息
     *
     * @param cityName
     * @return
     */
    @Query(value = "select city from City city where city.cityName = ?1")
    List<City> findByCityName(String cityName);

    /**
     * 根据城市id更新城市名称
     *
     * @param cityName
     * @param cityId
     * @return
     */
    @Modifying
    @Query("update City c set c.cityName = ?1 where c.cityId = ?2")
    int updateCityName(String cityName, Long cityId);

    /**
     * 保存实体对象
     *
     * @param city
     * @return
     */
    City save(City city);

}
