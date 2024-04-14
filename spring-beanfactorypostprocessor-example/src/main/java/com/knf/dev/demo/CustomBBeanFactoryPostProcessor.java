package com.knf.dev.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomBBeanFactoryPostProcessor {

    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor() {
        return beanFactory -> {
            System.out.println("Inside 'B'postProcessBeanFactory");
            GenericBeanDefinition bd = new GenericBeanDefinition();
            bd.setBeanClass(BBean.class);
            bd.getPropertyValues().add("bProperty", "B property");

            ((DefaultListableBeanFactory) beanFactory)
                    .registerBeanDefinition("myBBean", bd);
        };
    }
}
