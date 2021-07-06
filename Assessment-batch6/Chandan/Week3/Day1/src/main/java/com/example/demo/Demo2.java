package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo2 {
	
	
	public static void main(String[] args) {
//		Demo demo = new Demo();
//		
//		demo.setName("User1");
//		demo.setAddress("Delhi");
//		
//		System.out.println(demo.toString());
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
//		
//		Demo demo1 = (Demo) context.getBean("smalldemo1");
//		
//		System.out.println(demo1);
//		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		
		Demo demo1 = (Demo) context.getBean("smalldemo2");
		
		System.out.println(demo1);
		
		
		Demo3 demo3 = (Demo3) context.getBean("demo3"); 
		System.out.println(demo3);
		
	}
	
}
