package com.example.demo.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RequestLogger {

    // Log before any method in any controller class is executed
    @Before("execution(* com.example.demo.controller..*(..))")
    public void logBeforeControllerExecution() {
        System.out.println(" Executing a controller method...");
    }
}
