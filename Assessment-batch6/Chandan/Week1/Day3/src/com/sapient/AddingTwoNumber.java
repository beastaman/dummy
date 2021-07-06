package com.sapient;

public class AddingTwoNumber {
	
	private int num1, num2; 
	public int result;
	
	public AddingTwoNumber() {
		System.out.println("Zero Argument Constructor");
		this.num1 = 100;
		this.num2 = 200;
	}
	
	public AddingTwoNumber(int num) {
		System.out.println("One argument Constructor");
		this.num1 = this.num2 = num;
	}
	
	public AddingTwoNumber(int num1, int num2) {
		System.out.println("Two Argument Constructor");
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
//	public void setData(int num1, int num2) {
//		this.num1 = num1;
//		this.num2 = num2;
//		this.result = -1;
//	}
	
	public int add() {
		result = num1+num2;
		
		return result;
	}
	
	protected void finalize() {
		System.out.println("Object Destroyed having num1 = " + this.num1 + " & num2 = " + this.num2);
	}
	
}
