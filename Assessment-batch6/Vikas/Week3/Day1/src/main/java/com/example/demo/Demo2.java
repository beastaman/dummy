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
		
		
		//loosely coupled
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		
		Demo1 demo1 = (Demo1)context.getBean("demo1");
		Demo1 demo2 = (Demo1)context.getBean("const");
		
		System.out.println(demo1);
		System.out.println();
		System.out.println(demo2);
		
		Demo3 demo3 = (Demo3) context.getBean("demo3");
		System.out.println(demo3);
	}

}
