package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ArithmeticDemo {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ArithmeticContainer.class);
		IArithmetic arithmetic = context.getBean(AithmeticImplementation.class);
		
		try {
//			System.out.println(arithmetic.add(10.0, 12.0));
			System.out.println(arithmetic.add(-10.0, 12.0));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
