package com.sapient.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo2 {

	public static void main(String[] args) {
		
//		Demo1 demo1 = new Demo1();
//		demo1.setName("Everyone");
//		demo1.display();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Demo1 demo1 = (Demo1) context.getBean("demo1");
		demo1.display();
		
		Demo1 demo1_1 = (Demo1) context.getBean("demo1_1");
		demo1_1.display();
		
		Details details = (Details) context.getBean("details");
		details.display();
		System.out.println("Class : " + details.getClass());
	}
	
}
