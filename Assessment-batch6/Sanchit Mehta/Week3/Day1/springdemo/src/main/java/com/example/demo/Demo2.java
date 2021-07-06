package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Demo1 demo1=new Demo1();
//		demo1.setName("Sanchit");
//		demo1.setAge(23);
//		System.out.println(demo1);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		Demo1 demo=(Demo1)context.getBean("user");
		System.out.println(demo);
		
//		Details detail=(Details)context.getBean("details");
//		System.out.println(detail);							======> not working
	}
	
//	<bean id="user_constructor" class="com.example.demo.Demo1" scope="singleton">
//    <constructor-arg type="java.lang.String" value="Nikhil"/>
//    <constructor-arg type="java.lang.String" value="21"/>
//</bean>

}
