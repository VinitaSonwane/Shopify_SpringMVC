package com.jbk.aop;

import java.text.SimpleDateFormat;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.jbk.ScholarLogApplication;

@Component
@Aspect
public class MyAdvice {
	static Logger logger = LoggerFactory.getLogger(ScholarLogApplication.class);
	
    @Pointcut("execution(* com.jbk.controller.*(..)) ")
    public void p1(String fromAcc, String toAcc, double amount) {
        
    }

    @Before("p1()")
    public void startTime(String fromAcc, String toAcc, double amount) {
    	
    	String time = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss:SSS").format(new java.util.Date());
        logger.info("Execution start time : " + time );
    }
    
    @AfterReturning("p1()")
    public void endTime() {
    	
    	String time = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss:SSS").format(new java.util.Date());
        logger.info("Execution ended at  time : " + time );
    }
    
   
}
