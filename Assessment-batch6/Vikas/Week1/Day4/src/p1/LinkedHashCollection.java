package p1;

import java.util.*;

public class LinkedHashCollection {

	public static void main(String[] args) {

		Set<Integer>linkset = new LinkedHashSet<>();
		linkset.add(23);
		linkset.add(34);
		linkset.add(16);
		linkset.add(78);
		System.out.println(linkset);
		
		System.out.println();
		System.out.println("---------------------------");
		
		linkset.remove(23);
		System.out.println(linkset);
		
		System.out.println();
		System.out.println("---------------------------");
		
		System.out.println(linkset.contains(16));
		System.out.println(linkset.contains(45));
		
		System.out.println();
		System.out.println("---------------------------");
		
		System.out.println(linkset.size());
		
		System.out.println();
		System.out.println("---------------------------");
		
		System.out.println(linkset.isEmpty());
		
		System.out.println();
		System.out.println("---------------------------");
		
		 Iterator<Integer> iterator = linkset.iterator();  
         while(iterator.hasNext())  
         {  
        	 System.out.println(iterator.next());  
         }  
         
         System.out.println();
 		System.out.println("---------------------------");
         
 		linkset.clear();
         System.out.println(linkset.size());


	}

}
