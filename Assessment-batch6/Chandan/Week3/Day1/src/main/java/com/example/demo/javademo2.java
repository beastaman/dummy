package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class javademo2 {
	
	@Autowired
	public Demo4 demo4;
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaContainer.class);
		
		Demo3 demo3 = (Demo3) applicationContext.getBean("demo3");
		
		System.out.println(demo3);
		
		Demo demo = applicationContext.getBean(Demo.class);
		System.out.println(demo);
		
		// using autowire we do not need to create appicationcontext
		new javademo2().demo4.display();
		
	}
	
}
