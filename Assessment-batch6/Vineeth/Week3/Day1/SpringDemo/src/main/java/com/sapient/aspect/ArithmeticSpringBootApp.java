package com.sapient.aspect;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArithmeticSpringBootApp {
	
	@Autowired
	private ArithmeticInterface arithmeticInterface;
	
	public static void main(String[] args) {
		SpringApplication.run(ArithmeticSpringBootApp.class);
	}
	
	@PostConstruct
	public void init() {
		try {
			System.out.println(arithmeticInterface.add(10.0, 20.0));
			System.out.println(arithmeticInterface.add(100.0, -20.0));
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
}
