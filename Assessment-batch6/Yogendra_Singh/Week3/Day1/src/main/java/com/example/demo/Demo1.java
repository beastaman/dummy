package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class Demo1 {

	public static void main(String[] args) {
//		User demo = new User();
//		demo.setId(1);
//		demo.setAddress("Bangalore");
//		demo.setName("Rahul");
//		System.out.println(demo);
		
		//loosely coupled      inversion of control
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		User user = (User) context.getBean("user");
		User user1 = (User) context.getBean("user_constructor");
		System.out.println(user);
		System.out.println(user1);
		
		//Student student = (Student) context.getBean("details");
		//System.out.println(student);
	}

}
