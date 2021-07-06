package com.example.demo;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Demo2 {
	public static void main(String[] args) {
		/*Demo1 d1 = new Demo1();
		d1.setName("User1");
		d1.setAddress("delhi");
		
		System.out.println(d1);
		*/
		  ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		Demo1 d1 =(Demo1)context.getBean("smalldemo1");
		System.out.println(d1);
		
		
		Demo1 d2 =(Demo1)context.getBean("user_constructor");
		System.out.println(d2);
				 
		Details details =(Details)context.getBean("details");
		System.out.println(details);
		
	}

}
