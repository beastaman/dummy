package com.week1.day4.string;

public class DemoStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("hello");
		
		StringBuilder sb1 = sb;
		
		System.out.println(sb);
		System.out.println(sb1);
		
		sb1.append("Delhi");
		
		System.out.println(sb);
		System.out.println(sb1);
		
		
		
	}
}
