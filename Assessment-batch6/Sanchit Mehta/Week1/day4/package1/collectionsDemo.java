package com.package1;

import java.util.*;

public class collectionsDemo {

	public static void main(String[] args) {
		//List --> duplicates, ordered [ArrayList, Vectors, LinkedList]  sync/async
//		Set  --> no duplicates, [hashset, treeset, linked hashset] *
//		Queue --> FIFO [linkedlist]		//Queue is interface not class
//		Deque --> LIFO + FIFO [linkedlist]
		
		//Eg:- Map [hashmap, treemap, linked hashmap]
		
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(3);
		hs.add(4);
		
		Set<Integer> ts = new TreeSet<Integer>();
		ts.add(1225);
		ts.add(234);
		Set<Integer> linkedhs = new LinkedHashSet<Integer>();
		
		
		Queue<Integer> queue= new LinkedList<Integer>();
		
		Deque<Integer> dequeue = new LinkedList<Integer>();
		
		
		
		
		
		
	}

}
