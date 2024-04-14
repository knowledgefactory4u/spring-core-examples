package com.knf.dev.demo;

public class ABean {
    String aProperty;

    public void setAProperty(String aProperty) {
        this.aProperty = aProperty;
    }

    public void doStuff() {
        System.out.println("aProperty: " + aProperty);
    }
}
