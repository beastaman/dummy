package com.sapient.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.sapient.springdemo"})
public class JavaContainer {

    @Bean
    public Detail fun1(){
        return new Detail("Nikhil", 22);
    }

    @Bean
    public User fun2(){
        return new User("Nikhil", "Delhi");
    }
}
