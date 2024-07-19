package com.knf.dev.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.knf.dev.demo")
public class Config {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public UserService userService() {
        return new UserService();
    }

}