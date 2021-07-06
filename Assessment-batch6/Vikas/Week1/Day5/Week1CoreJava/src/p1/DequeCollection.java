package p1;
import java.util.*;

public class DequeCollection {

	public static void main(String[] args) {
		
		Deque<String>deque = new LinkedList<>();
		
		deque.add("India");
		deque.add("USA");
		deque.add("London");
		deque.add("France");
		deque.add("Africa");
		System.out.println(deque);
		
		System.out.println();
		System.out.println("---------------------------");
		
		deque.removeFirst();
		System.out.println(deque);

		System.out.println();
		System.out.println("---------------------------");
		
		deque.removeLast();
		System.out.println(deque);

		System.out.println();
		System.out.println("---------------------------");
		
		deque.addFirst("Canada");
		System.out.println(deque);

		System.out.println();
		System.out.println("---------------------------");
		
		deque.addLast("Kenya");
		System.out.println(deque);

		System.out.println();
		System.out.println("---------------------------");
		
		Iterator<String> iterator = deque.iterator();  
        while(iterator.hasNext())  
        {  
       	 System.out.println(iterator.next());  
        }
        
        System.out.println();
		System.out.println("---------------------------");
		
        System.out.println(deque.contains("India"));
        System.out.println(deque.contains("USA"));
        
        
	}

}
