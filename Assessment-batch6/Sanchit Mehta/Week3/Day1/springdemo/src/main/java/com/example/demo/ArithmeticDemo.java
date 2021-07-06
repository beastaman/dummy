package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ArithmeticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext context = new AnnotationConfigApplicationContext(ArithmeticContainer.class);
			Arithmetic arithmetic = context.getBean(ArithmeticImplementation.class);
			try {
				System.out.println(arithmetic.add(-10,20));
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
	}

}
