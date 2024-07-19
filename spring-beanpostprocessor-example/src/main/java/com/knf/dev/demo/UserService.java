package com.knf.dev.demo;

import org.springframework.stereotype.Component;

@Component
public class UserService  {

    public void init() {
        System.out.println("Perform initialization task.");
    }

    public void destroy() {
        System.out.println("Perform destructive task or release resources.");
    }

    public void printMessage() {
        System.out.println("Hello");
    }
}