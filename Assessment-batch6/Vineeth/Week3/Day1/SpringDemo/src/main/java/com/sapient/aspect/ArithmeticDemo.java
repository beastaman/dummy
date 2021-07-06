package com.sapient.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ArithmeticDemo {
	
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ArithmeticContainer.class);

		try {
			ArithmeticInterface arithmeticInterface = context.getBean(ArithmeticImplementation.class);
			System.out.println(arithmeticInterface.add(10.0, 20.0));
			System.out.println(arithmeticInterface.add(100.0, -20.0));
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
}
