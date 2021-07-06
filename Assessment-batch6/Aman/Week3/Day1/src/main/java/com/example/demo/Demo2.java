package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo2 {
	public static void main(String[] args) {
//		User demo1 = new User();
//		demo1.setName("Aman");
//		demo1.setAddress("Bihar");
//		System.out.println(demo1);
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		User demo1 = (User)context.getBean("user");
		System.out.println(demo1);
		User demo2 = (User)context.getBean("user_constructor");
		System.out.println(demo2);
		Details details = (Details) context.getBean("details");
		System.out.println(details);
	}
}
