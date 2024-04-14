package com.knf.dev.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBeanFactoryPostProcessor {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext contextA =
                new AnnotationConfigApplicationContext(Config.class);
        ABean aBean = contextA.getBean(ABean.class);
        //ABean aBean = (ABean) contextA.getBean("myABean");
        //ABean aBean = contextA.getBean("myABean",ABean.class);
        aBean.doStuff();

        AnnotationConfigApplicationContext context2 =
                new AnnotationConfigApplicationContext(
                        CustomBBeanFactoryPostProcessor.class);
        BBean bBean =  context2.getBean(BBean.class);
        //BBean bBean = (BBean) context2.getBean("myBBean");
        //BBean bBean =  context2.getBean("myBBean",BBean.class);
        bBean.doStuff();
    }
}
