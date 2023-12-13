package com.knf.dev.demo;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class MyComponent  {


    @PostConstruct
    public void postConstruct() throws Exception {
        System.out.println("After bean initialization");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Perform destructive task or release resources.");
    }

    public void printMessage() {
        System.out.println("Hello");
    }

}