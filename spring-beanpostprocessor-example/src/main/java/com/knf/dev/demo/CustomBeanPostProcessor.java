package com.knf.dev.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(
            Object bean, String beanName) throws BeansException {
        System.out.println(
                "postProcessBeforeInitialization() is called for " + beanName);

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(
            Object bean, String beanName) throws BeansException {
        System.out.println(
                "postProcessAfterInitialization() is called for " + beanName);

        return bean;
    }
}
