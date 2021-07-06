package p2;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Demo2 {

	public void function1(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is even");
		} else
			System.out.println(a + " is odd");
	}

	public void fun2(EmployeeTO employeeTO) {
		System.out.println(employeeTO);
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(33);
		list.add(42);
		list.add(98);
		list.add(32);
		list.add(25);

		Consumer<Integer> consumer = (a) -> {
			System.out.println(a);
		};

		consumer.accept(25);

		BiConsumer<Integer, String> biConsumer = (a, b) -> {
			System.out.println(a + " " + b);
		};

		biConsumer.accept(25, "user");
		
		System.out.println();

		// static method
		list.forEach(System.out::println);

		System.out.println();

		// instance method
		list.forEach(consumer::accept);

		System.out.println();

		Demo2 demo2 = new Demo2();

		list.forEach(demo2::function1);

		System.out.println();

		List<EmployeeTO> employeeTOs = new ArrayList<>();

		for (int i = 1; i < 6; i++) {
			employeeTOs.add(new EmployeeTO(i, "userfirst" + (6 - i), "userlast" + (6 - i), 20 + i, i*10001));
		}

		employeeTOs.forEach(System.out::println);
		System.out.println("fist employee call");
		
		// :: -> scope operators

		System.out.println();

		Consumer<EmployeeTO> consumer2 = (a) -> {
			System.out.println(a);
		};

		employeeTOs.forEach(consumer2::accept);
		System.out.println("second employee call");

		System.out.println();

		//basis of salary -> ASC
		
		Collections.sort(employeeTOs, (a,b) -> (b.getSalary() - a.getSalary()));
		
		
		employeeTOs.forEach(consumer2::accept);
		
		System.out.println();
		
		Collections.shuffle(employeeTOs);
		employeeTOs.forEach(consumer2::accept);
		

		System.out.println();
		Collections.sort(employeeTOs, (a, b) -> (a.getFname().compareTo(b.getFname())));

		employeeTOs.forEach(consumer2::accept);
		
		System.out.println();
		
		List<EmployeeTO> employeeTOs2 = employeeTOs.stream().filter((a) -> (a.getSalary() > 25000)
				).collect(Collectors.toList());
		
		
		employeeTOs2.forEach(consumer2::accept);
		
		
		int totalAge = employeeTOs.parallelStream().mapToInt(EmployeeTO::getAge).sum();
		
		Double average = employeeTOs.parallelStream().mapToDouble(EmployeeTO::getAge).average().orElse(-1);
		
		System.out.println("Total ages : " + totalAge);
		
		System.out.println("Average : " + average);
		
		System.out.println();
		List<Integer> ls = employeeTOs.stream().map(EmployeeTO::getAge).collect(Collectors.toList());
		
		ls.forEach(System.out::println);
		
		System.out.println();
		
		
		List<String> names = employeeTOs.stream().map(EmployeeTO::getFname).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
	}

}
