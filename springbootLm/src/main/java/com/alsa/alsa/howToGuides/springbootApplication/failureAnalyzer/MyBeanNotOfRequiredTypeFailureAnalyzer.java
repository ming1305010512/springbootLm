package com.alsa.alsa.howToGuides.springbootApplication.failureAnalyzer;

import org.springframework.beans.factory.BeanNotOfRequiredTypeException;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/8/24
 * @Time: 10:36
 * @Description:
 */
public class MyBeanNotOfRequiredTypeFailureAnalyzer extends AbstractFailureAnalyzer<BeanNotOfRequiredTypeException> {
    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, BeanNotOfRequiredTypeException cause) {
        return new FailureAnalysis(getDescription(cause),getAction(cause),cause);
    }

    private String getDescription(BeanNotOfRequiredTypeException ex){
        return String.format("The bean %s could not be injected as %s "
                        + "because it is of type %s",
                ex.getBeanName(),
                ex.getRequiredType().getName(),
                ex.getActualType().getName());
    }

    private String getAction(BeanNotOfRequiredTypeException ex) {
        return String.format("Consider creating a bean with name %s of type %s",
                ex.getBeanName(),
                ex.getRequiredType().getName());
    }
}
