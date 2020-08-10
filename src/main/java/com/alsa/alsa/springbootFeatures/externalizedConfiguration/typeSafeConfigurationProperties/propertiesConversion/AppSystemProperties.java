package com.alsa.alsa.springbootFeatures.externalizedConfiguration.typeSafeConfigurationProperties.propertiesConversion;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.net.InetAddress;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/28
 * @Time:9:25
 * @Description: duration测试
 */
@ConfigurationProperties("app.system")
@Validated
public class AppSystemProperties {
    @DurationUnit(ChronoUnit.MINUTES)
    private Duration sessionTimeOut ;
    @DurationUnit(ChronoUnit.HOURS)
    private Duration readTimeout ;

    @NotNull
    private String name;

    public Duration getSessionTimeOut() {
        return sessionTimeOut;
    }

    public void setSessionTimeOut(Duration sessionTimeOut) {
        this.sessionTimeOut = sessionTimeOut;
    }

    public Duration getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(Duration readTimeout) {
        this.readTimeout = readTimeout;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
