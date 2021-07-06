package com.sapient.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Demo2 {

	public void fun1(int a)
	{
		if(a%2==0)
		{
			System.out.println(a+" is even");
		}
		else
		{
			System.out.println(a+" is odd");
		}
	}
	public static void main(String[] args) {

		//predefined functional interface 
		Consumer<Integer> consumer = (a) -> {
			System.out.println(a);
		};
		
		consumer.accept(10);
		
		BiConsumer<Integer, String> biConsumer = (a,b) -> {
			System.out.println(a+ " " + b);
		};
		biConsumer.accept(10,"user");

		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(50);
		list.add(40);
		list.add(30);
		list.add(20);
		
		list.forEach(System.out::println);
		
		System.out.println();
		
		list.forEach(consumer::accept);
		
		System.out.println();
		
		Demo2 demo2= new Demo2();
		
		list.forEach(demo2::fun1);
		
		System.out.println();
		
		List<EmployeeTO> employeeTOs = new ArrayList<>();
		
		for(int i=1;i<6;i++)
		{
			employeeTOs.add(new EmployeeTO(-i, "user" + (5 - i), 20 + i));
		}
		
		employeeTOs.forEach(System.out::println);
		
		System.out.println();
		
		Consumer<EmployeeTO> consumer2 = (a) -> {
			System.out.println(a);
		};
		
		employeeTOs.forEach(consumer2::accept);
		
		System.out.println();
		
		Collections.sort(employeeTOs,(a,b)->(a.getEmpId()-b.getEmpId())); // ascending sort
		
		Collections.shuffle(employeeTOs);
		
		employeeTOs.forEach(consumer2::accept);
		
		System.out.println();
		
		Collections.sort(employeeTOs,(a,b)->(a.getEmpName().compareTo(b.getEmpName())));
		
		employeeTOs.forEach(consumer2::accept);
		
		System.out.println();
		
		//List of employees with age>22
		
		List<EmployeeTO> employeeTOs2 = employeeTOs.stream().filter((a)->(a.getAge()>22)).collect(Collectors.toList());
		
		employeeTOs2.forEach(consumer2::accept);
		
		//Total of ages of emplyees
		
		int totalAge = employeeTOs.stream().mapToInt(EmployeeTO::getAge).sum();
		
		Double average = employeeTOs.stream().mapToDouble(EmployeeTO::getAge).average().orElse(-1);
		
		System.out.println("Total ages : " + totalAge);
		
		System.out.println("Average : " + average);
		
		System.out.println();
		
		List<Integer> ls = employeeTOs.stream().map(EmployeeTO::getAge).collect(Collectors.toList());
	
		ls.forEach(System.out::println);
		
		
		System.out.println();
		List<String> names = employeeTOs.stream().map(EmployeeTO::getEmpName).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}

}
