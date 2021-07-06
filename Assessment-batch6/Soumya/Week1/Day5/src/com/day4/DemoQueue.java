package com.day4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(5);
		q.add(30);

		System.out.println(q);

		Iterator iterator = q.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		System.out.println();
		System.out.println("Size " + q.size());
		System.out.println("Head " + q.peek());

		q.remove(10);

		System.out.println("Size " + q.size());
		System.out.println("Head " + q.peek());

		System.out.println("head while removing " + q.poll());
		System.out.println("Size " + q.size());
	}
}
