package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo")
public class JavaContainer {

	@Bean
	public Details f1() {
		return new Details("Aritra", 23);
	}
	
	
}
