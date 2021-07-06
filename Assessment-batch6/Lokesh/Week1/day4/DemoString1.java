package com.week1.day4;

public class DemoString1 {


	public static void main(String[] args) {
		
		
		String s1 = "Wasim";
		
		String s2 = "Wasim";
		
		String s3 = new String("Wasim");
		
		s2 = s2 + "delhi";
		
		if(s1 == s2) {
			System.out.println("YES");
		}
		
		else {
			System.out.println("NO");
		}
		
		if(s1 == s3) {
			System.out.println("YES");
		}
		
		else {
			System.out.println("NO");
		}
		
		if(s1.equals(s2)) {
			System.out.println("YES");
		}
		
		else {
			System.out.println("NO");
		}
		
		
		if(s1.equals(s3)) {
			System.out.println("YES");
		}
		
		else {
			System.out.println("NO");
		}
		
		
		
	}
	
}
