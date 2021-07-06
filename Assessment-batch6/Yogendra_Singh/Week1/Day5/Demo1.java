package com.dayfive;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.dayfour.EmployeeTO;

public class Demo1 {

	public void f1(int a)
	{
		if(a%2 == 1)
			System.out.println(a + " is odd ");
		else
			System.out.println(a + " is even ");
	}
	
	public void f2 (EmployeeTO employee) {
		System.out.println(employee);
	}
	 
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(0);
		list.add(41);
		list.add(30);
		list.add(20);
		
		Consumer<Integer> consumer = (a) -> {
			System.out.println(a*a);
		};
		consumer.accept(10);
		BiConsumer<Integer, String> biConsumer = (a,b) -> {
			System.out.println(a+ " "+ b);
		};
		biConsumer.accept(34, "Yogendra ");
		
		//method reference
		 //static method reference
		list.forEach(System.out::println);
		System.out.println("--------------------");
		// instance method reference
		list.forEach(consumer);
		System.out.println("--------------------");
		Demo1 demo1 = new Demo1();
		list.forEach(demo1::f1);
		
		List<EmployeeTO> employees = new ArrayList<>();
		employees.add(new EmployeeTO(23,"Yogendra","Singh",54000) );
		employees.add(new EmployeeTO(22,"User1","sname1",52000) );
		employees.add( new EmployeeTO(21,"User2","sname2",51000) );
		employees.add( new EmployeeTO(24,"User3","sname3",50000) );
		employees.add( new EmployeeTO(34,"User4","sname4",55000) );
		
		employees.forEach(demo1::f2);
		System.out.println("---------------------");
		employees.forEach(System.out::println);
		System.out.println("---------------------");
		Consumer<EmployeeTO> consumer2 = (a) ->{
			System.out.println(a);
		};
		employees.forEach(consumer2);
		
		System.out.println("---------------------");
		//sort on the basis of user name
		Collections.sort(employees,(a,b) -> (a.getAge()-b.getAge() ));
		employees.forEach(consumer2);
		System.out.println("---------------------");
		Collections.sort(employees,(a,b) -> (a.getFirstName().compareTo(b.getFirstName()) ));
		employees.forEach(consumer2);
		
		System.out.println("---------------------");
		List<EmployeeTO> employees1 = employees.stream().filter((a) -> (a.getAge()>22)).collect(Collectors.toList());
		employees1.forEach(consumer2);
		
		//find total of all age 
		//find average of all age
		System.out.println(employees.stream().mapToInt(EmployeeTO::getAge).sum());
		System.out.println(employees.stream().mapToDouble(EmployeeTO::getAge).average().orElse(-1) );
		
		List<String> names = employees.stream().map(EmployeeTO::getFirstName).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}

}
