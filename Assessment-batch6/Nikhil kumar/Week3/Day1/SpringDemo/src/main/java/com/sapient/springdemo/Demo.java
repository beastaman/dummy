package com.sapient.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
//        System.out.println(User.builder().name("Nikhil").address("Uttam Nagar, Delhi");

        //loosely Couped - IoC
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        User user1 = (User)context.getBean("user");
        System.out.println(user1);

        User user2 = (User)context.getBean("user_constructor");
        System.out.println(user2);

        //Auto Creation of bean by the spring itself
        Detail detail = (Detail) context.getBean("details");
        System.out.println(detail);


    }
}
