package com.knf.dev.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {

    public static void main(String[] args) {

        AbstractApplicationContext  context =
                new AnnotationConfigApplicationContext(Config.class);
        MyComponent myComponent = context.getBean(MyComponent.class);
        myComponent.printMessage();

        context.close();
    }
}