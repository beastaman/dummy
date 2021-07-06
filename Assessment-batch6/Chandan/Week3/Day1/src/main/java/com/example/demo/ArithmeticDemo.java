package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ArithmeticDemo {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ArithmeticContainer.class);
		
		IArithmetic arithmetic = context.getBean(ArithmeticImpl.class);
		
		try {
			System.out.println(arithmetic.add(-4.0, 5.0));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
}
