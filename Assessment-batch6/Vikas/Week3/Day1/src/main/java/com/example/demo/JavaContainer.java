package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.example.demo")
public class JavaContainer {
	@Bean
	public Demo3 func1() {
		return new Demo3("User3", 25);
	}
	
	@Bean
	public Demo1 func2() {
		Demo1 demo1 = new Demo1();
		demo1.setAddress("Kolkata");
		demo1.setName("User4");
		return demo1;
	}
}
