package com.sapient.week1.day5;
import java.util.function.*;

public class demo {
	
	public static void f1(int x, int y, Calculate calculate) {
		System.out.println(calculate.cal(x, y));
	}
	
	public static void main(String[] args) {
		Calculate calculate = (a, b) -> (a + b);
		
		System.out.println(calculate.cal(10, 20));
		calculate = (a, b) -> (a-b);
		System.out.println(calculate.cal(10, 20));
		
		f1(10, 20, (a, b)->(a*b));
	}
}
