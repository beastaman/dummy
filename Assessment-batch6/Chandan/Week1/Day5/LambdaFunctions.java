package com.sapient.day5;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import com.sapient.day4.EmployeeTo;

public class LambdaFunctions {
	
	private static void fun(int a, int b, Calculate calculate) {
		System.out.println(calculate.add(a,b));
	}
	
	private void func1(int a) {
		System.out.println(a*a);
	}
	
	
	public static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public static void main(String[] args) {
		
		LogManager lgmngr = LogManager.getLogManager();
		
		
		Calculate calculate = (a,b) -> (a+b);
		
		System.out.println(calculate.add(10, 20));
		
		fun(15,5, (a,b)->(a*b));
		
		
		// Inbuilt Functional Interfaces
		
		Consumer<Integer> consumer = (a) -> System.out.println(a);
		
		consumer.accept(5);
		
		BiConsumer<Integer, String> biconsumer = (a,b) -> System.out.println(a + " " + b);
		
		biconsumer.accept(5, "asdf");
		
		
		
		// Method References
		
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(4);
		
		// instance method reference
		LambdaFunctions lambdaFunctions = new LambdaFunctions();
		list.forEach(lambdaFunctions::func1);
//		list.forEach((a)->System.out.println(a*a));
//		list.forEach((a)->System.out.println(calculate.add(a, 5)));
		
		
		//static method
		list.forEach(System.out::println);
		
		
		
		
		List<EmployeeTo> emps = new ArrayList<>();
		
		for(int i=0; i<=5; i++) {
			emps.add(new EmployeeTo(20+i, "user"+i, "name"+i, 1000+i*100 ));
		}
		
		
		emps.forEach(System.out::println);
		
		
		Collections.shuffle(emps);
//		System.out.println();
//		emps.forEach(System.out::println);
		
		//sort age
		Collections.sort(emps, (a,b) -> (a.getAge() - b.getAge()));
		System.out.println();
		emps.forEach(System.out::println);
		
		Collections.shuffle(emps);
		
		//sort fname
		Collections.sort(emps, (a,b) -> (a.getFname().compareTo(b.getFname())));
		System.out.println();
		emps.forEach(System.out::println);
		
		
		//age>22
		List<EmployeeTo> emps1 = emps.stream().filter((a)->(a.getAge()>22)).collect(Collectors.toList());
		System.out.println();
		emps1.forEach(System.out::println);
		
		
		//extract ages
		List<Integer> ages = emps.stream().map(EmployeeTo::getAge).collect(Collectors.toList());
		System.out.println();
		ages.forEach(System.out::println);
		
		
		//total of ages
		int totalages = emps.stream().mapToInt(EmployeeTo::getAge).sum();
		System.out.println();
		System.out.println(totalages);
		
		
		//average of ages
		double averageage = emps.stream().mapToInt(EmployeeTo::getAge).average().orElse(-1);
		System.out.println();
		System.out.println(averageage);
		

	}

}
