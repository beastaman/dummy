package com.sapient;

public class addTwoNumbers {
	private int a, b;
	
	public addTwoNumbers() {
		System.out.println("I am in zero argument constructor");
		this.a = 100;
		this.b = 200;
	}
	
	public addTwoNumbers(int num) {
		System.out.println("I am in one argument constructor");
		this.a = this.b = num;
	}
	
	public addTwoNumbers(int a, int b) {
		System.out.println("I am in two argument constructor");
		this.a = a;
		this.b = b;
	}
	
	public void setData() {
		this.a = Read.scanner.nextInt();;
		this.b = Read.scanner.nextInt();
	}
	
	public int getSum() {
		return a+b;
	}
	
	protected void finalize() throws Throwable {
		System.out.println("destructor is running");
	}
}
