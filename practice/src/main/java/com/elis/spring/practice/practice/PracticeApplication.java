package com.elis.spring.practice.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PracticeApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(PracticeApplication.class, args);

        InjectedByConstructorService ConstructorService = (InjectedByConstructorService) ctx.getBean("injectedByConstructorService");

        ConstructorService.getMessage();

        SetterBasedService setterBasedService = (SetterBasedService) ctx.getBean("setterBasedService");

        setterBasedService.getMessage();
    }

}
