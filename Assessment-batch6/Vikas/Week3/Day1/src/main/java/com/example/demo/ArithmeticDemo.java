package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ArithmeticDemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ArithmeticContainer.class);
		
		Arithmetic arithmetic = context.getBean(ArithmeticImplementation.class);
		
		try {
			
			System.out.println(arithmetic.add(10.0, 20.0));
			
			System.out.println(arithmetic.sub(2000.0, 1000.0));
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

}
