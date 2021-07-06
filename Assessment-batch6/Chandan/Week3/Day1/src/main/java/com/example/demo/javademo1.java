package com.example.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class javademo1 {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaContainer.class);
		
		Demo3 demo3 = (Demo3) applicationContext.getBean("demo3");
//		Demo3 demo3 = applicationContext.getBean(Demo3.class);
		
		System.out.println(demo3);
		
		Demo demo = applicationContext.getBean(Demo.class);
		System.out.println(demo);
		
	}
	
}
