package com.example.demo;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Demo2 {
	public static void main(String[] args) {
	  ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
	  Demo2 d1 =(Demo2)context.getBean("smalldemo1");
	  System.out.println(d1);
	
	
	  Demo2 d2 =(Demo2)context.getBean("user_constructor");
	  System.out.println(d2);
			 
	  Details details =(Details)context.getBean("details");
	  System.out.println(details);
		
	}

}