package com.knf.dev.demo;

public class UserService  {

    private String username;

    public void init() {
        System.out.println("Perform initialization task.");
        System.out.println("Username= "+username);
    }


    public void destroy() {
        System.out.println("Perform destructive task or release resources.");
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}