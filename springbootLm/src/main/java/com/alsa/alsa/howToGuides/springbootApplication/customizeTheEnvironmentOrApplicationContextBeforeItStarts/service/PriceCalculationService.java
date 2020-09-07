package com.alsa.alsa.howToGuides.springbootApplication.customizeTheEnvironmentOrApplicationContextBeforeItStarts.service;

import com.alsa.alsa.howToGuides.springbootApplication.customizeTheEnvironmentOrApplicationContextBeforeItStarts.calculator.PriceCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/8/24
 * @Time: 14:40
 * @Description:
 */
@Service
public class PriceCalculationService {
    @Autowired
    PriceCalculator priceCalculator;

    public double productTotalPrice(double singlePrice, int quantity) {
        return priceCalculator.calculate(singlePrice, quantity);
    }
}
