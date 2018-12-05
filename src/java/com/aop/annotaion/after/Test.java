package com.aop.annotaion.after;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BankConfig.class);
        Bank bank = context.getBean(Bank.class);
        bank.loan();
        bank.deposit();
        bank.withdraw();
    }
    
}
