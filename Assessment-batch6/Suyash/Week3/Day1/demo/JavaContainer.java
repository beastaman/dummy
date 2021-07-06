package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//Now this will become a container (after adding config)
//We cannot have multiple bean object for Demo3
//For other classes we can have
@Configuration()
@ComponentScan("com.example.demo")
public class JavaContainer {
	@Bean
	public Demo3 fun1() {
		return new Demo3("susyu",22);
	}
	
}
