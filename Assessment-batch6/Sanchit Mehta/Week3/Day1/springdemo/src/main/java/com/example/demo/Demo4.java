package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo4 {
	
	@Autowired
	public Details2 details2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext applicationcontext= new AnnotationConfigApplicationContext(JavaContainer.class);
			Details details= (Details)applicationcontext.getBean(Details.class);
			System.out.println(details);
			
			Demo1 demo1=(Demo1)applicationcontext.getBean(Demo1.class);
			System.out.println(demo1);
			
			new Demo4().details2.display();
	}

}
