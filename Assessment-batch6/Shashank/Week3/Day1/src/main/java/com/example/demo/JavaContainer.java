package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.example.demo")
public class JavaContainer {
	
	@Bean
	public Details fun1() {
		return new Details("rahul" , 22);
	}
	// only 1 function can be there with return type of one class (eg details)
	
	@Bean
	public Demo1 fun2() {
		Demo1 user = new Demo1();
		user.setAddress("Chennai");
		user.setName("Ankit");
		return user;
	}

}
