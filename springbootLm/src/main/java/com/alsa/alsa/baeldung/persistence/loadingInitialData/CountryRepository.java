package com.alsa.alsa.baeldung.persistence.loadingInitialData;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/8/25
 * @Time: 10:37
 * @Description:
 */
public interface CountryRepository extends JpaRepository<Country,Long> {
}
