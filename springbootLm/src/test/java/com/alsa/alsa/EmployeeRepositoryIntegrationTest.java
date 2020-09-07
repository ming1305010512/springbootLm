package com.alsa.alsa;

import com.alsa.alsa.baeldung.test.Employee;
import com.alsa.alsa.baeldung.test.EmployeeRepository;
import com.alsa.alsa.springbootActuator.endpoint.customEndpoint.EndpointService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/8/17
 * @Time: 10:41
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootLmApplication.class)
@Sql({"/data.sql"})
public class EmployeeRepositoryIntegrationTest {

//    @Autowired
//    private TestEntityManager entityManager;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void whenFindByName_thenReturnEmployee() {
        System.out.println(11);
        System.out.println(employeeRepository.findAll());
    }

    @Test
    public void save(){
        Employee employee = new Employee("bbb");
        employeeRepository.save(employee);
    }
}
