package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo1 {

	@Autowired
	public Details2 details2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaContainer.class);

		Details detail = context.getBean(Details.class);

		System.out.println(detail);

		new Demo1().details2.display();
	}

}
