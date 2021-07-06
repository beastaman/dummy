package com.week1.day4.collections;

import java.util.*;

public class DemoMap {

	public static void main(String[] args) {

		Map<Integer, Integer> map = new LinkedHashMap<>();

		map.put(11, 10);
		map.put(51, 10);
		map.put(23, 112);
		map.put(51, 1213);
		map.put(11, 1230);
		map.put(56, 1124);
		map.put(12, 1210);

		map.put(11, map.getOrDefault(11, 0) * 2);

		Set<Integer> keys = map.keySet();

		for (int key : keys) {
			System.out.println("Key : " + key + " | Value : " + map.get(key));
		}

		System.out.println(map.size());

		System.out.println(map.isEmpty());

		System.out.println(map.containsKey(11));
		System.out.println(map.containsKey(113));

		System.out.println(map.remove(21));

		System.out.println(map.remove(11));

		map.clear();

		System.out.println(map.size());

	}

}
