package com.aop.annotaion.after;

import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankConfig {
    
    @Bean
    public Bank bank(){
        return new Bank();
    }
    
     public AnnotationAwareAspectJAutoProxyCreator annotationAwareAspectJAutoProxyCreator(){
        return  new AnnotationAwareAspectJAutoProxyCreator();
    }
   
}
