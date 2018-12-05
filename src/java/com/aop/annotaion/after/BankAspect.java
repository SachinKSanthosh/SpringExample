package com.aop.annotaion.after;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class BankAspect {

    @Pointcut("execution(* Bank.*(..)")
    public void pointcut() { }
    
    @After("pointcut()")
    public void ourConcern(JoinPoint jp){
         System.out.println("Sending sms........");
    }

}
