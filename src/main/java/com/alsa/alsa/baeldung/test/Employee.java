package com.alsa.alsa.baeldung.test;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/8/17
 * @Time: 10:38
 * @Description:
 */
@Entity
@Table(name = "person")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min = 3, max = 20)
    private String name;

    public Employee(@Size(min = 3, max = 20) String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
