package com.elis.spring.practice.practice;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloService {
    public void seyHello() {
        System.out.println("first spring App");
    }
}
