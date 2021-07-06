package com.sapient.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Detail1 {
    public void display(){
        System.out.println("Hello from auto-wiring");
    }
}
