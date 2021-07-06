package com.sapient.day4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DataStructuresDemoList {

	public static void main(String [] args)
	{
		List<Integer> arraylist = new LinkedList<>();
		arraylist.add(40);
		arraylist.add(10000);
		arraylist.add(10);
		arraylist.add(5000);

		System.out.println(arraylist);
		arraylist.sort(null);

		System.out.println("--------------------------------------------------");
		System.out.println(arraylist);

		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}

		System.out.println("--------------------------------------------------");

		Iterator<Integer> iterator = arraylist.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("--------------------------------------------------");

		for (Integer arrayIndice : arraylist) {
			System.out.println(arrayIndice);
		}

	}
}
