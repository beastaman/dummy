package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ArithmeticDemo {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ArithmeticContainer.class);
		
		IArithmetic arithmetic = ac.getBean(ArithmeticImplementation.class);
		try {
			
			System.out.println(arithmetic.Addition(-10.0,60.0));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
