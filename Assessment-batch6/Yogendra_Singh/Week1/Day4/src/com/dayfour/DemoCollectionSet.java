package com.dayfour;

import java.util.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class DemoCollectionSet {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();  
		set.add(5);
		set.add(99);
		set.add(23);
		set.add(43);

		for(Integer x:set)
			System.out.println(x);
		System.out.println("--------------");
//		Collections.sort(list);
//		for(Integer x:list)
//			System.out.println(x);
//		System.out.println("--------------");
//		Collections.shuffle(list);
//		for(Integer x:list)
//			System.out.println(x);
		
		Iterator<Integer> itr= set.iterator();
		while(itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();
		System.out.println("--------------");
		 set.remove(23);
		 for(Integer x:set)
				System.out.print(x+ " ");
		 
		 
	}
}
