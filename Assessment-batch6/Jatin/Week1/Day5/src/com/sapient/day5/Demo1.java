package com.sapient.day5;

public class Demo1 {

	public static void main(String[] args) {
		
		Calculate c1 = (a, b) -> (a + b);
		Calculate c2 = (a, b) -> (a - b);

		System.out.println(c1.cal(10, 20));
		System.out.println(c2.cal(10, 20));
	}
}
