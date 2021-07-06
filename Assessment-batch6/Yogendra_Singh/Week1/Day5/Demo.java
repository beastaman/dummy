package com.dayfive;

public class Demo {
	public static void f1(int x,int y,Calculate calculate) {
		System.out.println(calculate.cal(x,y) );
	}

	public static void main(String[] args) {
		Calculate calculate = (a,b) -> (a+b);
		System.out.println(calculate.cal(20, 30));
		calculate = (a,b) -> (a-b);
		System.out.println(calculate.cal(20, 30));
		f1(30,20, (a,b) -> (a*b) );
	}

}
