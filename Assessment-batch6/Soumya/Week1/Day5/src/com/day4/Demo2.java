package com.day4;

public class Demo2 {

	public static void main(String[] args) {

		String s1 = "Soumya";
		String s2 = "Soumya";
		String s3 = new String("Soumya");
		if (s1 == s2)
			System.out.println("Yes");
		else
			System.out.println("NO");
		if (s1 == s3)
			System.out.println("Yes");
		else
			System.out.println("NO");
		if (s1.equals(s2))
			System.out.println("Yes");
		else
			System.out.println("NO");
		if (s1.equals(s3))
			System.out.println("Yes");
		else
			System.out.println("NO");
	}

}
