package com.week1.day4.collections;

import java.util.*;

public class DemoCollectionsList {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(5);
		list.add(30);

		System.out.println(list);

		Collections.sort(list);

		System.out.println("Sorted : " + list);

//		Collections.shuffle(list);
//		System.out.println("Shuffeled : " + list);

		System.out.println(Collections.binarySearch(list, 20));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("-----------");

		for (Integer val : list) {
			System.out.println(val);
		}
		System.out.println("-----------");

		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		list.add(0, 200);

		System.out.println(list);

		list.remove(1);

		System.out.println(list);

//		list.remove(new Integer(30));
		list.remove(Integer.valueOf(30));

//		list.remove(list.size() - 1 , new Integer(30));

		System.out.println(list);

		list.clear();

		System.out.println(list);

	}
}
