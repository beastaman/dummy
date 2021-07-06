package p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaDemo {

	public void fun(Integer a) {
		if (a % 20 == 0)
			System.out.println(a + " is multiple of 20");
		else
			System.out.println(a + " is not multiple of 20");
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(50);
		list.add(10);
		list.add(70);
		list.add(40);
		
		// static method
		list.forEach(System.out::println);
		System.out.println();
		
		// instance method
		Consumer<Integer> consumer = (a) -> { System.out.println(a*a); };
		list.forEach(consumer::accept);
		System.out.println();
		
		LambdaDemo lambda = new LambdaDemo();
		list.forEach(lambda::fun);
		System.out.println();

		// predicate
		Predicate<Integer> predicate = (a) -> (a % 20 == 0);
		System.out.println(list.stream().filter(predicate).count() + " are divisible by 20\n");
		
		List<Employee> emps = new ArrayList<>();
		for (int i=1;i<6;i++) {
			Employee emp = new Employee(6-i, "Emp " + i, 20 + i);
			emps.add(emp);
			System.out.println(emp + " is added to list");
		}
		System.out.println();
		
		emps.forEach(System.out::println);
		System.out.println();
		
		Consumer<Employee> consumer2 = (emp) -> { System.out.println(emp); };
		emps.forEach(consumer2::accept);
		System.out.println();
		
		Collections.shuffle(emps);
		emps.forEach(System.out::println);
		System.out.println();
		
		Collections.sort(emps, (emp1, emp2) -> (emp1.getId() - emp2.getId()));
		emps.forEach(System.out::println);
		System.out.println();

		Collections.sort(emps, (emp1, emp2) -> (emp1.getName().compareTo(emp2.getName())));
		emps.forEach(System.out::println);
		System.out.println();
		
		List<Employee> emps1 = emps.stream().filter((emp) -> (emp.getAge() > 22)).collect(Collectors.toList());
		emps1.forEach(System.out::println);
		System.out.println();
		
		int sum = emps.stream().mapToInt((emp) -> emp.getAge()).sum();
		double avg = emps.stream().mapToInt((emp) -> emp.getAge()).average().getAsDouble();
		System.out.println("Age -> Sum : " + sum + " Avg : " + avg + "\n");
	}
}
