package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1 {

	public static void main(String[] args) {
		User user1 = new User("User1", "Delhi");
		System.out.println(user1);

		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		User dem1 = (User) context.getBean("user1");

		System.out.println(dem1);

		User dem2 = context.getBean("user_constructor", User.class);
		System.out.println(dem2);

		Details details = (Details) context.getBean("details");
		System.out.println(details);

	}

}
