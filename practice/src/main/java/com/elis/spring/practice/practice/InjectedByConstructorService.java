package com.elis.spring.practice.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectedByConstructorService {

    private HelloService helloService;

    @Autowired
    public InjectedByConstructorService(HelloService helloService) {
        this.helloService = helloService;
    }

    public void getMessage() {
        helloService.seyHello();
    }
}
