package com.infosys.services;

import java.text.DateFormat;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class LoggingAspect {
	
	@Around("execution(* com.infosys.services.ReportService.generateReport(..))")      
 public Object logAdvice(ProceedingJoinPoint jp) {
		System.out.println("Before: In around advice");
        long start = System.currentTimeMillis();
        Object retVal = null;
        try {
            retVal = jp.proceed();
            
        } catch (Throwable e) {        
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("After: In around advice");
        System.out.println("Report generation took:" + (end-start)+ " milliseconds");
        retVal = "Value returned from advice : " + retVal; // modifying the return value from Joinpoint 
        System.out.println(retVal);
        return (retVal); // returning the modified value to client
	}
    

}
