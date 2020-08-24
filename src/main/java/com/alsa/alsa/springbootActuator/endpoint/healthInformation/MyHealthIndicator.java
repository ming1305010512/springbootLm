package com.alsa.alsa.springbootActuator.endpoint.healthInformation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/8/1
 * @Time:15:43
 */
@Component
public class MyHealthIndicator implements HealthIndicator {


    private Integer healthStatus;

    @Override
    public Health health() {
        Health health ;
        if (healthStatus>0){
            health = Health.up().withDetail("healthStatus",healthStatus)
                    .withDetail("message","我的状态是好的")
                    .build();
        }else {
            health = Health.down().withDetail("healthStatus",healthStatus)
                    .withDetail("message","我的状态不好")
                    .build();
        }
        return health;
    }
}
