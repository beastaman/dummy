package com.week1.day4.collections;

import java.util.*;

public class DemoCollectionsDequeue {

	public static void main(String[] args) {

		Deque<Integer> deque = new LinkedList<>();

		deque.add(10);
		deque.add(30);
		deque.add(20);
		deque.add(50);
		deque.add(60);
		deque.add(10);

		Iterator<Integer> iterator = deque.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		System.out.println();

		deque.addFirst(20);

		iterator = deque.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		System.out.println();

		deque.addFirst(50);

		iterator = deque.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		System.out.println();

		System.out.println("Front elem : " + deque.peekFirst());
		System.out.println("Front elem : " + deque.peekLast());

		deque.remove();

		iterator = deque.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		System.out.println();

		deque.removeLast();

		iterator = deque.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		System.out.println();

		deque.removeLastOccurrence(Integer.valueOf(50));

		iterator = deque.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		System.out.println();

	}

}
