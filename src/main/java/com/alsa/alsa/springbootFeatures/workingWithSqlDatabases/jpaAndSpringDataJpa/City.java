package com.alsa.alsa.springbootFeatures.workingWithSqlDatabases.jpaAndSpringDataJpa;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/30
 * @Time:16:58
 */
@Entity
@Table(name = "ALSA_TEST_CITY")
public class City implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cityId;

    @Column(nullable = false)
    private String cityName;

    @Column(nullable = false)
    private String state;

    protected City(){}

    public City(String cityName, String state) {
        this.cityName = cityName;
        this.state = state;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
