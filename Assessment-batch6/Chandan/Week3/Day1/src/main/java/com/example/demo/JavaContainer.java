package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.example.demo")
public class JavaContainer {
	
	@Bean
	public Demo3 fun1() {
		return new Demo3("User1java", 21);
	}
	
	
	public Demo fun2() {
		return new Demo("asdsa", "Delhi");
	}
}
