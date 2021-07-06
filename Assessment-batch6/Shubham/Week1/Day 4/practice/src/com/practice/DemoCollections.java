package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrl = new ArrayList<>();
		arrl.add(10);
		arrl.add(10);
		arrl.add(5);
		arrl.add(8);
//		System.out.println(arrl.get(2));
//		System.out.println(arrl.hashCode());
//		System.out.println(arrl.lastIndexOf(10));
//		System.out.println(arrl.remove(0));
//		System.out.println(arrl);
//		Collections.sort(arrl);
//		System.out.println(arrl);
		
		
		Set<Integer> setl=new HashSet<>();
		setl.add(10);
		setl.add(10);
		setl.add(5);
		setl.add(8);
		System.out.println(setl.hashCode());
		System.out.println(setl);
		System.out.println(setl.remove(10));
		System.out.println(setl);
		System.out.println(setl.addAll(Arrays.asList(1,2,3)));
		System.out.println(setl);
		
		
	}

}
