package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ArithmeticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ArithmeticContainer.class);
		IArithmetic arithmetic = applicationContext.getBean(ArithmeticImplementation.class);
		try {
			System.out.println(arithmetic.add(20.0, 105.0));
			System.out.println(arithmetic.add(20.0, -105.0));
			System.out.println(arithmetic.add(20.0, 1005.0));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
