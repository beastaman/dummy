package com.sapient;

import java.util.Scanner;

public class demo1 {
	public static void main(String[] args) throws Throwable {
		System.out.println("hello world");
		
		//new demo1().Add();
		
		addTwoNumbers obj = new addTwoNumbers();
		
		obj.setData();
		System.out.println(obj.getSum());
		
		obj.finalize();
	}
	
	
	
	private void Add() {
		int a = Read.scanner.nextInt();
		int b =	Read.scanner.nextInt();
		
		System.out.println(a+b);
	}
}
