package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClass {
    
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Configs.class);
        MyClass myClass = context.getBean(MyClass.class);
        myClass.display();
    }
    
}
