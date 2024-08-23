package com.jbk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScholarLogApplication {

    static Logger logger = LoggerFactory.getLogger(ScholarLogApplication.class);

    public static void main(String[] args) {
       
        SpringApplication.run(ScholarLogApplication.class, args);
        logger.info("App started");
        System.out.println("App started");
    }
}
