package p1;

import java.util.*;

public class TreeSetCollection {

	public static void main(String[] args) {
		Set<Integer>treeset = new TreeSet<>();
		treeset.add(23);
		treeset.add(34);
		treeset.add(16);
		treeset.add(78);
		System.out.println(treeset);
		
		System.out.println();
		System.out.println("---------------------------");
		
		treeset.remove(23);
		System.out.println(treeset);
		
		System.out.println();
		System.out.println("---------------------------");
		
		System.out.println(treeset.contains(16));
		System.out.println(treeset.contains(45));
		
		System.out.println();
		System.out.println("---------------------------");
		
		System.out.println(treeset.size());
		
		System.out.println();
		System.out.println("---------------------------");
		
		System.out.println(treeset.isEmpty());
		
		System.out.println();
		System.out.println("---------------------------");
		
		 Iterator<Integer> iterator = treeset.iterator();  
         while(iterator.hasNext())  
         {  
        	 System.out.println(iterator.next());  
         }  
         
         System.out.println();
 		System.out.println("---------------------------");
         
         treeset.clear();
         System.out.println(treeset.size());

	}

}
