package com.sapient.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sapient.demo")
public class JavaContainer {

    @Bean
    public Details fun1() {
        return new Details("haha", 12);
    }

    @Bean
    public User fun2() {
        return new User("mumbai", "user1");
    }
}
