package com.alsa.baeldung.test;

import com.alsa.alsa.SpringBootStartApplication;
import com.alsa.alsa.baeldung.test.Employee;
import com.alsa.alsa.baeldung.test.EmployeeRepository;
import com.alsa.alsa.springbootActuator.endpoint.customEndpoint.EndpointService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
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
//@DataJpaTest
@SpringBootTest(classes = SpringBootStartApplication.class)
@ComponentScan(value = {"com.alsa"})
public class EmployeeRepositoryIntegrationTest {

//    @Autowired
//    private TestEntityManager entityManager;

    @Autowired
    private EndpointService endpointService;

    @Test
    public void whenFindByName_thenReturnEmployee() {
        System.out.println(11);
        System.out.println(endpointService.readOperationTest("2222"));
    }
}
