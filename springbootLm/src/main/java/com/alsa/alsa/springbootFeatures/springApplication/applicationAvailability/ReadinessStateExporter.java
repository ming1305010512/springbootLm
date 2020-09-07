package com.alsa.alsa.springbootFeatures.springApplication.applicationAvailability;

import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/25
 * @Time:10:41
 */
@Component
public class ReadinessStateExporter {

    @EventListener
    public void onStateChange(AvailabilityChangeEvent<ReadinessState> event){
        System.out.println("hello,我监听到了就绪状态变化事件");
        // switch (event.getState()){
        //     case REFUSING_TRAFFIC:
        //         System.out.println("拒绝传输信息");break;
        //     case ACCEPTING_TRAFFIC:
        //         System.out.println("接受传输信息");break;
        // }
    }
}
