package com.sapient.day4;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DataStructuresDemoMap {

	public static void main(String[] args) {
		System.out.println("TreeMap");

		Map<Integer,Integer> set = new TreeMap<>();
		set.a
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

	}

}
