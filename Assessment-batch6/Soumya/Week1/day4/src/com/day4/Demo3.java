package com.day4;

public class Demo3 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("hello");
		StringBuilder sb1 = sb;

		System.out.println(sb);
		System.out.println(sb1);

		sb1 = sb1.append("delhi");

		System.out.println(sb);
		System.out.println(sb1);
	}

}
