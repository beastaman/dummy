package com.sapient.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ArithmeticDemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ArithmeticContainer.class);
        ArithmeticOperation operation = context.getBean(ArithmeticImpl.class);
        try{
            System.out.println(operation.add(-1000.0,2.0));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
