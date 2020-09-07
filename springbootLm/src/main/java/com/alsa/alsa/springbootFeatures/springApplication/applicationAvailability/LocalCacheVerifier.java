package com.alsa.alsa.springbootFeatures.springApplication.applicationAvailability;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/25
 * @Time:10:44
 */
@Component
public class LocalCacheVerifier {

    private final ApplicationEventPublisher eventPublisher;

    public LocalCacheVerifier(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void checkLocalCache(){
        try {
            int i = 1/0;
        } catch (Exception e) {
            e.printStackTrace();
            // AvailabilityChangeEvent.publish(this.eventPublisher,e, LivenessState.BROKEN);
        }
    }
}
