package com.alsa.baeldung.persistence.loadingInitialData;

import com.alsa.alsa.SpringbootLmApplication;
import com.alsa.alsa.baeldung.persistence.loadingInitialData.CountryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/8/25
 * @Time: 10:40
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootLmApplication.class)
@Sql({"/schema.sql","/data.sql"})
public class InitialDataTest {

    @Autowired
    private CountryRepository countryRepository;

    @Test
    public void findAll(){
        System.out.println(countryRepository.findAll());
    }
}
