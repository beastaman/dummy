package com.sapient.week1.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.*;
import java.util.stream.Collectors;

public class demo2 {
	
	public void f1(int a) {
		if(a%2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
	
	public void f2(EmployeeTO emp) {
		System.out.println(emp);
	}
	
	public static void main(String[] args) {
		Consumer<Integer> consumer = (a) -> {
			System.out.println(a*a);
		};
		
		consumer.accept(10);
		
		List<Integer> list = new ArrayList<>();
		
		list.add(20);
		list.add(31);
		list.add(40);
		list.add(50);
		
		list.forEach(consumer::accept);
		
		demo2 dm2 = new demo2();
		
		
		list.forEach(dm2::f1);
		System.out.println();
		
		
		List<EmployeeTO> employeeTOs = new ArrayList<>();
		for(int i=0; i<5; i++) {
			employeeTOs.add(new EmployeeTO(i+1, "User"+i, 30+i));
		}
		
		employeeTOs.forEach(dm2::f2);
		System.out.println("--------------");
		
		employeeTOs.forEach(System.out::println);
		System.out.println();
		Consumer<EmployeeTO> consumer2 = (a) -> {
			System.out.println(a);
		};
		
		System.out.println();
		employeeTOs.forEach(consumer2::accept);
		System.out.println();
		Collections.sort(employeeTOs, (a, b) -> (a.getId() - b.getId()));
		
		Collections.shuffle(employeeTOs);
		employeeTOs.forEach(consumer2::accept);
		System.out.println();
		Collections.sort(employeeTOs, (a, b) -> (a.getId() - b.getId()));
		employeeTOs.forEach(consumer2::accept);
		System.out.println();
		
		
		List<EmployeeTO> employeeTOs2 = employeeTOs.stream().filter(
				(a)->(a.getAge()>32)).collect(Collectors.toList());
		
		employeeTOs2.forEach(consumer2::accept);
		System.out.println();
		
		int totalAge = employeeTOs.stream().mapToInt(EmployeeTO::getAge).sum();

		OptionalDouble averageAge = employeeTOs.stream().mapToDouble(EmployeeTO::getAge).average();

		System.out.println("Total age is : " + totalAge);
		System.out.println("Average age is : " + averageAge);
		
		System.out.println("------------------");
		
		List<String> names = employeeTOs.stream().map(EmployeeTO::getName).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
		
	}
}











