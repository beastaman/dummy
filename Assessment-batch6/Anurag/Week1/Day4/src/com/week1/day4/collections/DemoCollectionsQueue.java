package com.week1.day4.collections;

import java.util.*;

public class DemoCollectionsQueue {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();

		queue.add(10);
		queue.add(30);
		queue.add(20);
		queue.add(50);
		queue.add(60);
		queue.add(40);
		queue.add(10);

		Iterator<Integer> iterator = queue.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		System.out.println();

		System.out.println("Queue size : " + queue.size());

		System.out.println("Queue front elem : " + queue.peek());

		System.out.println("Is queue empty? " + queue.isEmpty());

		queue.remove();

		iterator = queue.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		System.out.println("Queue values :");
		while (!queue.isEmpty()) {
			System.out.print(queue.poll() + " ");
		}

		System.out.println();

	}
}
