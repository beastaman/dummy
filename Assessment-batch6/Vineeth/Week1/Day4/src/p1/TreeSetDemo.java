package p1;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>();
		set.add(30);
		set.add(10);
		set.add(70);
		set.add(20);
		set.add(50);
		set.add(80);
		
		System.out.println("Set : " + set);
		set.remove(20);
		
		set.forEach(e -> System.out.print(e + " "));
		System.out.println();
		
		for (int i=0;i<100;i+=10) System.out.println("Set contains " + i + " : " + set.contains(i));
	}

}
