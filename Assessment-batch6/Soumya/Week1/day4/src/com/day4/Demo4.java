package com.day4;

public class Demo4 {

	public static void main(String[] args) {
		String s1 = "Delhi";
		String s2 = new String("Delhi");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		s2 += "Mumbai";

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		StringBuilder s3 = new StringBuilder("Delhi");

		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());

		s3.append("Mumbai");

		System.out.println(s3.hashCode());
	}
}
