package com.sapient.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(10);
		list.add(110);
		list.add(50);

		list.forEach(System.out::println);

//		a=list.get(0);
		Predicate<Integer> predicate = (a) -> (a == 10);

		System.out.println(predicate.test(list.get(0)));

		Consumer<Integer> consumer = (a) -> System.out.println(a);

		consumer.accept(10);

		list.forEach((n) -> {
			System.out.println(n);
		});
	}

}
