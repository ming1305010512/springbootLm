package com.alsa.alsa.howToGuides.springbootApplication.customizeTheEnvironmentOrApplicationContextBeforeItStarts.calculator;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/8/24
 * @Time: 14:37
 * @Description:
 */
public interface PriceCalculator {
    public double calculate(double singlePrice, int quantity);
}
