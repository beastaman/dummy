package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		
//      Collections is a framework in Java which is made of interfaces
//      In Java Framework we have got 2 main interfaces:
//        	1) Collections (only value) :
//        		List (supports duplicates and are ordered) :
//        			ArrayList (Async)
//        			Vector (Sync)
//        			LinkedList (Faster with large data)
//        		Set (no duplicates and are unordered) :
//        			HashSet (no duplicates and are unordered)
//        			TreeSet (no duplicates and sorted order)
//        			LinkedHashSet (no duplicates and are ordered as entered)
//        		Queue (FIFO) :
//        			using LinkedList
//        		Dequeue (FIFO and LIFO) :
//        			using LinkedList
//        		
//        	2) Map (key-value pair) :
//    			HashMap (no duplicates and not ordered)
//    			TreeMap (no duplicates and sorted order)
//    			LinkedHashMap (no duplicates and are ordered as entered)
        		
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(5);
		list.add(70);
		list.add(50);
		
		System.out.println("list : " + list);
		
		for(int i=0;i<list.size();i++) System.out.print(list.get(i) + " ");
		System.out.println();
		
		for(Integer e : list) System.out.print(e + " ");
		System.out.println();
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) System.out.print(it.next() + " ");
		System.out.println();
		
		Collections.sort(list);
		System.out.println("Position of 50 in " + list + " : " + Collections.binarySearch(list, 50));
		
		Collections.shuffle(list);
		System.out.println("Shuffled List : " + list);
	}

}
