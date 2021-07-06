package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo4 {
	@Autowired
	public  Demo5 demo5;

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaContainer.class);
		Demo3 demo3 = (Demo3) applicationContext.getBean("Demo3.class");
		System.out.println(demo3);
		
		Demo1 demo1 = (Demo1) applicationContext.getBean("Demo1.class");
		System.out.println(demo1);
		
		//new Demo5().demo5.display();
	}

}
