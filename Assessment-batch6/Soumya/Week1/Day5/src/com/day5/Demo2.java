package com.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Demo2 {

	public void fun1(int a) {
		if (a % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}

	public static void main(String[] args) {

		Consumer<Integer> consumer = (a) -> {
			System.out.println(a * a);
		};

		consumer.accept(10);

		BiConsumer<Integer, String> biconsumer = (a, b) -> {
			System.out.println(a + " " + b);
		};

		biconsumer.accept(10, "hi");

		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(5);
		list.add(15);

		list.forEach(System.out::println);
		list.forEach(consumer::accept);

		Demo2 demo = new Demo2();
		list.forEach(demo::fun1);

		List<EmployeeTO> employeeTOs = new ArrayList<>();

		for (int i = 1; i < 6; ++i)
			employeeTOs.add(new EmployeeTO(i, "user" + i, 20));

		employeeTOs.forEach(System.out::println);

		Consumer<EmployeeTO> consumer2 = (a) -> {
			System.out.println(a);
		};

		employeeTOs.forEach(consumer2);

		// sort on basis of user id

		System.out.println();
		Collections.sort(employeeTOs, (a, b) -> (b.getEmpId() - a.getEmpId()));

		employeeTOs.forEach(consumer2);

		// sort on basis of user name
		System.out.println();
		Collections.sort(employeeTOs, (a, b) -> (a.getName().compareTo(b.getName())));

		employeeTOs.forEach(consumer2);

		System.out.println();
		List<EmployeeTO> employeeTOs2 = employeeTOs.stream().filter((a) -> (a.getEmpId() > 2))
				.collect(Collectors.toList());

		employeeTOs2.forEach(consumer2);

		// Total of all age

		int totalAge = employeeTOs.parallelStream().mapToInt(EmployeeTO::getAge).sum();
		Double average = (employeeTOs.parallelStream().mapToDouble(EmployeeTO::getAge).average()).orElse(-1);

		System.out.println(totalAge);
		System.out.println(average);

		List<String> names = employeeTOs.stream().map(EmployeeTO::getName).collect(Collectors.toList());

		// System.out.println(names);

		names.forEach(System.out::println);

	}

}
