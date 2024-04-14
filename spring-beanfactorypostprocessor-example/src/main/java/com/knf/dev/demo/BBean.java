package com.knf.dev.demo;

public class BBean {
    String bProperty;

    public void setBProperty(String bProperty) {
        this.bProperty = bProperty;
    }

    public void doStuff() {
        System.out.println("bProperty: " + bProperty);
    }
}
