package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo2 {

	public static void main(String[] args) {
		
//		User demo1 = new User();
//		demo1.setName("Jack");
//		demo1.setAddress("LA");
//
//		System.out.println(demo1);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		User user1 = (User)context.getBean("user");
		System.out.println(user1);
		
		user1 = (User)context.getBean("constructor");
		System.out.println(user1);
		
		Details demo3 = (Details) context.getBean("demo3");
		System.out.println(demo3);
	}

}
