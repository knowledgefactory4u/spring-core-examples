package com.knf.dev.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class MyComponent implements InitializingBean, DisposableBean {


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Perform initialization task.");
    }

    @Override
    public void destroy() {
        System.out.println("Perform destructive task or release resources.");
    }

    public void printMessage() {
        System.out.println("Hello");
    }

}