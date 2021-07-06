package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo4 {
	
	//it directly takes object from the container
	//Below using application context we have done manual wiring
	//
	@Autowired
	public Demo5 demo5;
	
	
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(JavaContainer.class);
		Demo3 demo3= applicationContext.getBean(Demo3.class);
		//In java container it will check for return type of Demo3
		//and implement it
		System.out.println(demo3);
		
		
		new Demo4().demo5.display();
	}
}
