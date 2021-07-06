package com.example.demo;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.example.demo")
public class JavaContainer {
	
	@Bean
	public Details fun1() {
		return new Details("Sanchit", "13");
	}
	
	@Bean
	public Demo1 fun2() {
		Demo1 demo= new Demo1();
		demo.setName("Sanchit");
		demo.setAge(15);
		return demo;
	}
	
	
}
