package p1;

import java.util.*;

public class HashSetCollection {
	public static void main(String[] args) {
		
		Set<String>set = new HashSet<>();
		set.add("Delhi");
		set.add("Mumbai");
		set.add("Chennai");
		set.add("Gujrat");
		System.out.println(set);
		
		System.out.println();
		System.out.println("---------------------------");
		
		set.remove("Mumbai");
		System.out.println(set);
		
		System.out.println();
		System.out.println("---------------------------");
		
		System.out.println(set.contains("Chennai"));
		System.out.println(set.contains("Banglore"));
		
		System.out.println();
		System.out.println("---------------------------");
		
		System.out.println(set.size());
		
		System.out.println();
		System.out.println("---------------------------");
		
		System.out.println(set.isEmpty());
		
		System.out.println();
		System.out.println("---------------------------");
		
		 Iterator<String> iterator = set.iterator();  
         while(iterator.hasNext())  
         {  
        	 System.out.println(iterator.next());  
         }  
         
        System.out.println();
 		System.out.println("---------------------------");
         
         set.clear();
         System.out.println(set.size());
	}
}
