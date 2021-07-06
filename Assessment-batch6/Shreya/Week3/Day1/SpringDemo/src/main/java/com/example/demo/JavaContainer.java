package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.example.demo")
public class JavaContainer {
	
	@Bean
	public Details f1()
	{
		return new Details("Shreya", 21);
		
	}
	
	@Bean
	public User f2()
	{
		User user= new User();
		user.setAddress("Bangalore");
		user.setName("ShreyaRaj");
		return user;
	}

}
