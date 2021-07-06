package p1;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeDemo {

	public static void main(String[] args) {
	
		Deque<Integer> deque = new LinkedList<>();
		deque.add(20);
		deque.add(30);
		deque.add(5);
		deque.add(70);
		deque.add(50);
		
		System.out.println("deque : " + deque);
		
		for(Integer e : deque) System.out.print(e + " ");
		System.out.println();
		
		Iterator<Integer> it = deque.iterator();
		while(it.hasNext()) System.out.print(it.next() + " ");
		System.out.println();

		deque.addFirst(10);
		System.out.println("Adding 10 to Front : " + deque);

		deque.addLast(40);
		System.out.println("Adding 40 to End : " + deque);

		deque.removeFirst();
		System.out.println("Deleting from Front : " + deque);

		deque.removeLast();
		System.out.println("Deleting from End : " + deque);
		
		while(!deque.isEmpty()) System.out.print(deque.poll() + " ");
		System.out.println();
		System.out.println(deque);
	}

}
