package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo4 {
	@Autowired
	public static Details2 details2;
	
public static void main(String[] args) {
	ApplicationContext applicationcontext = new AnnotationConfigApplicationContext(JavaContainer.class);
	Details details = (Details) applicationcontext.getBean(Details.class);
	System.out.println(details);
	
	Demo1 user =  applicationcontext.getBean(Demo1.class);
	System.out.println(user);
	
	new Demo4().details2.Display();
	
}
}
