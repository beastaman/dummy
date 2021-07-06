package com.sapient.day4;

import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {
	
	
	public static void setPractice() {

		Set<Integer> set = new TreeSet<>();
		
		
		set.add(10);
		set.add(20);
		set.add(50);
		set.add(40);
		
		System.out.println(set);
		
		set.add(10);
		
		System.out.println(set);
		
		set.remove(10);
		System.out.println(set);
		
		set.clear();
		System.out.println(set);
		
	}
	
	
	public static void queuePractice() {

		Deque<Integer> queue = new LinkedList<>();
		
		queue.add(10);
		queue.add(50);
		queue.add(20);
		
		System.out.println(queue);
		
		queue.removeLast();
		queue.removeFirst();
		
		System.out.println(queue);
		
		queue.add(30);
		System.out.println(queue);
		
		Iterator<Integer> iterator = queue.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		queuePractice();
		
	}
}
