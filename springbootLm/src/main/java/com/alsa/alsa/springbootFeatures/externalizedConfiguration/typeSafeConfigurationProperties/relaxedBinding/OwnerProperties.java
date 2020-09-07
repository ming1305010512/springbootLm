package com.alsa.alsa.springbootFeatures.externalizedConfiguration.typeSafeConfigurationProperties.relaxedBinding;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/27
 * @Time:19:41
 */
@ConfigurationProperties(prefix = "acme.my-project.person")
public class OwnerProperties {

    private String firstName;

    private Map<String,String> map;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "OwnerProperties{" +
                "firstName='" + firstName + '\'' +
                ", map=" + map +
                '}';
    }
}
