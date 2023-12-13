package com.knf.dev.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    
    public static void main(String[] args) {

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");
        UserService userService = (UserService)context.getBean("userService");
        System.out.println("User Name= "+ userService.getUsername());

        context.close();
    }
}