package p1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
	
		Queue<Integer> queue = new LinkedList<>();
		queue.add(20);
		queue.add(30);
		queue.add(5);
		queue.add(70);
		queue.add(50);
		
		System.out.println("queue : " + queue);
		
		for(Integer e : queue) System.out.print(e + " ");
		System.out.println();
		
		Iterator<Integer> it = queue.iterator();
		while(it.hasNext()) System.out.print(it.next() + " ");
		System.out.println();
		
		while(!queue.isEmpty()) System.out.print(queue.poll() + " ");
		System.out.println();
	}

}
