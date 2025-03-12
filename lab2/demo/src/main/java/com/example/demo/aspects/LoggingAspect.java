package com.example.demo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.demo.controller.UserController.*(..))")
    public void logBeforeMethodCall() {
        System.out.println("A method in UserController is about to be called...");
    }
}
