package com.knf.dev.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public static CustomABeanFactoryPostProcessor myBean() {
        return new CustomABeanFactoryPostProcessor();
    }
}
