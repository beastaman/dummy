package com.week1.day4;

public class DemoString {
	
	public static void main(String[] args) {
		
		String s1 = "delhi";
		String s2 = new String("delhi");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		s2 += "Mumbai";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		StringBuilder s3 = new StringBuilder("delhi");
		
		System.out.println(s3.hashCode());
		System.out.println(s1.hashCode());
		
		s3.append("Mumbai");
		
		System.out.println(s3.hashCode());
		
		
		
		
	}

}
