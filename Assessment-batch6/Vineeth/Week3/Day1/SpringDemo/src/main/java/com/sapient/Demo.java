package com.sapient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	@Autowired
	public Details details1;
	
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaContainer.class);

		Details details = context.getBean(Details.class);
		details.display();
		System.out.println("Class : " + details.getClass());
		
		System.out.println(new Demo().details1);
	}

}
