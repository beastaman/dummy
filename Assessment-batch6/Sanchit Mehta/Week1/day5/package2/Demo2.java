package com.package2;

import java.util.*;
import java.util.function.*;

public class Demo2 {
	
	public static void fun1(int a) {
		if(a%2==0)
			System.out.println(a+"is even");
		else
			System.out.println(a+"is odd");
	}
	public void fun2(EmployeeTO employeeTo) {
		System.out.println(employeeTo);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(50);
		list.add(40);
		list.add(30);
		list.add(25);
		
		Consumer<Integer> consumer=(a)->{
			System.out.println(a);
		};
		
		consumer.accept(10);
		
		BiConsumer<Integer,String> biconsumer=(a,b)->{
			System.out.println(a+ " "+ b);
		};
		
		biconsumer.accept(10,"user\n");
		
		//predicate
		
		//method reference
		
		//static method
		
		list.forEach(System.out::println);
		
	}

}
