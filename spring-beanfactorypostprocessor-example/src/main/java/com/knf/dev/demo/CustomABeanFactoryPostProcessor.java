package com.knf.dev.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class CustomABeanFactoryPostProcessor
        implements BeanFactoryPostProcessor {


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
            throws BeansException {
        System.out.println("Inside 'A'postProcessBeanFactory");
        GenericBeanDefinition bd = new GenericBeanDefinition();
        bd.setBeanClass(ABean.class);
        bd.getPropertyValues().add("aProperty", "A property");

        ((DefaultListableBeanFactory) beanFactory)
                .registerBeanDefinition("myABean", bd);
    }
}
