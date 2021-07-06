package com.sapient.day4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DataStructureDemoSet {

	public static void main(String[] args) {
		System.out.println("TreeSet");

		Set<Integer> set = new TreeSet<>();
		set.add(40);
		set.add(10000);
		set.add(10);
		set.add(5000);

		System.out.println(set);

		System.out.println("--------------------------------------------------");

		Iterator<Integer> iterator = set.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("--------------------------------------------------");

		for (Integer arrayIndice : set) {
			System.out.println(arrayIndice);
		}

		System.out.println("HashSet");

		set = new HashSet<>();
		set.add(80);
		set.add(00000);
		set.add(110);
		set.add(52200);

		System.out.println(set);

		System.out.println("--------------------------------------------------");

		iterator = set.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("--------------------------------------------------");

		for (Integer arrayIndice : set) {
			System.out.println(arrayIndice);
		}
		
		System.out.println("LinkedHashSet");
		set = new LinkedHashSet<>();
		set.add(10);
		set.add(230000);
		set.add(1440);
		set.add(524400);

		System.out.println(set);

		System.out.println("--------------------------------------------------");

		iterator = set.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("--------------------------------------------------");

		for (Integer arrayIndice : set) {
			System.out.println(arrayIndice);
		}
	}
}
