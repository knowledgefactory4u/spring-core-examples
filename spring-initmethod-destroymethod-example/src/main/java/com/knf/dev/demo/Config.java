package com.knf.dev.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public UserService userService(){
        return new UserService();
    }
}
