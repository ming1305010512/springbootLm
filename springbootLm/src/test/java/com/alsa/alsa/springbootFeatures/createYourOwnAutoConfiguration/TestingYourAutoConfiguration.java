package com.alsa.alsa.springbootFeatures.createYourOwnAutoConfiguration;

import com.alsa.alsa.springbootFeatures.creatingYourOwnAutoConfiguration.Service.UserService;
import com.alsa.configuration.config.MyConfig;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.context.annotation.Configuration;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/27
 * @Time:14:16
 */
public class TestingYourAutoConfiguration {

    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner().withConfiguration(AutoConfigurations.of(UserConfiguration.class));

    @Test
    public void defaultServiceBacksOff(){
        this.contextRunner.withUserConfiguration(MyConfig.class).run((context -> {
            // Assertions.assertThat(context).hasSingleBean(UserService.class);
            Assertions.assertThat(context).getBean("myUserService").isSameAs(context.getBean(UserService.class));
        }));
    }
    @Configuration(proxyBeanMethods = false)
    static class UserConfiguration {

        UserService myUserService(){
            return new UserService("mine");
        }
    }
}
