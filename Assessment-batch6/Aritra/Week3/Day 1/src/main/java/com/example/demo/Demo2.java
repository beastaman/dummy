package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Demo2 {

	public static void main(String[] args) {
		
//		Demo1 demo1 = new Demo1();
//		
//		demo1.setName("User1");
//		demo1.setAddress("Delhi");
//		
//		System.out.println(demo1);
//		
//		
		//loosely coupled
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		
		User user = (User)context.getBean("demo1");
		User demo2 = (User)context.getBean("const");
		
		System.out.println(user);
		System.out.println();
		System.out.println(demo2);
		
		Details details = (Details)context.getBean("details");
		System.out.println(details);
		
	}

}