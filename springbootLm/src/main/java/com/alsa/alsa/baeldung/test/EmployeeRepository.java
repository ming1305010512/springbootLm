package com.alsa.alsa.baeldung.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/8/17
 * @Time: 10:40
 * @Description:
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    public Employee findByName(String name);
}
