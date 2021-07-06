package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo2 {

	@Autowired
	public Details2 details2;

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaContainer.class);
		Details details = (Details) context.getBean(Details.class);
		System.out.println(details);

		new Demo2().details2.display();
	}

}
