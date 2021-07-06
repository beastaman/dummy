package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// User demo1 = new User();

		// demo1.setAddress("delhi");
		// demo1.setName("hello");

		// System.out.println(demo1);

		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

		User demo1 = (User) context.getBean("user");
		User demo2 = (User) context.getBean("user-using-constructor");
		Details demo3 = (Details) context.getBean("details");
		System.out.println(demo3);
	}

}
