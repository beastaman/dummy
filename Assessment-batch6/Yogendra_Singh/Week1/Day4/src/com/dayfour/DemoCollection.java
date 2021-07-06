package com.dayfour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DemoCollection {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); 
		list.add(5);
		list.add(99);
		list.add(23);
		list.add(43);

		for(Integer x:list)
			System.out.println(x);
		System.out.println("--------------");
		Collections.sort(list);
		for(Integer x:list)
			System.out.println(x);
//		System.out.println("--------------");
//		Collections.shuffle(list);
//		for(Integer x:list)
//			System.out.println(x);
		
		Iterator<Integer> itr= list.iterator();
		while(itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();
		System.out.println("--------------");
		 list.remove(2);
		 for(Integer x:list)
				System.out.print(x+ " ");
		 
		 
	}
}
