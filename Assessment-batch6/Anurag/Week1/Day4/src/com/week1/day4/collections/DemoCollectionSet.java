package com.week1.day4.collections;

import java.util.*;

public class DemoCollectionSet {

	public static void main(String[] args) {

		Set<Integer> set = new TreeSet<>();

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

		set.remove(30);

		Iterator<Integer> iterator1 = set.iterator();

		while (iterator1.hasNext()) {
			System.out.print(iterator1.next() + " ");
		}

	}

}
