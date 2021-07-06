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
		return new Details("Ryan", 40);
	}
	
	@Bean
	public User fun2() {
		User user = new User();
		user.setName("user");
		user.setAddress("Delhi");
		return user;
	}
}
