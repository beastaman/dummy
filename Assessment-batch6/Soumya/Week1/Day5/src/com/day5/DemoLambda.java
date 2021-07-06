package com.day5;

public class DemoLambda {

	public static void f1(int x, int y, Calculate calculate) {
		System.out.println(calculate.cal(x, y));
	}

	public static void main(String[] args) {

		Calculate calculate = (a, b) -> a + b;

		System.out.println(calculate.cal(10, 12));

		calculate = (a, b) -> a - b;
		System.out.println(calculate.cal(10, 12));
	}

}
