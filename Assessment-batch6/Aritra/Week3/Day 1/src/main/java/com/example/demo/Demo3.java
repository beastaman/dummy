package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo3 {
	
	@Autowired
	public Details2 details2;

	public static void main(String[] args) {

		ApplicationContext ac =  new AnnotationConfigApplicationContext(JavaContainer.class);
		
		Details details = (Details)ac.getBean(Details.class);
		System.out.println(details);
		
		new Demo3().details2.display();
		
	}

}
