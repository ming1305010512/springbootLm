package com.alsa.alsa.howToGuides.springbootApplication.customizeTheEnvironmentOrApplicationContextBeforeItStarts.autoConfig;

import com.alsa.alsa.howToGuides.springbootApplication.customizeTheEnvironmentOrApplicationContextBeforeItStarts.calculator.GrossPriceCalculator;
import com.alsa.alsa.howToGuides.springbootApplication.customizeTheEnvironmentOrApplicationContextBeforeItStarts.calculator.NetPriceCalculator;
import com.alsa.alsa.howToGuides.springbootApplication.customizeTheEnvironmentOrApplicationContextBeforeItStarts.calculator.PriceCalculator;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/8/24
 * @Time: 14:39
 * @Description:
 */
@Configuration
@AutoConfigureOrder(Ordered.HIGHEST_PRECEDENCE)
public class PriceCalculationAutoConfig {
    @Bean
    @ConditionalOnProperty(name = "com.baeldung.environmentpostprocessor.calculation.mode", havingValue = "NET")
    @ConditionalOnMissingBean
    public PriceCalculator getNetPriceCalculator() {
        return new NetPriceCalculator();
    }

    @Bean
    @ConditionalOnProperty(name = "com.baeldung.environmentpostprocessor.calculation.mode", havingValue = "GROSS")
    @ConditionalOnMissingBean
    public PriceCalculator getGrossPriceCalculator() {
        return new GrossPriceCalculator();
    }
}
