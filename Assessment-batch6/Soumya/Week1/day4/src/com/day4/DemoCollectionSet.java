package com.day4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoCollectionSet {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();

		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(50);
		set.add(5);

		for (Integer val : set) {
			System.out.print(val + " ");
		}

		System.out.println();

		Iterator<Integer> iterator = set.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		System.out.println();

	}

}
