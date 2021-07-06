package com.sapient;

public class Add {

	private int number1;
	private int number2;
	private int number3;
	
	public Add() {
		number1 = 100;
		number2 = 200;
		System.out.println("I'm in No Args Constructor!");
	}
	
	public Add(int num) {
		setData(num, num);
		System.out.println("I'm in One Args Constructor!");
	}
	
	public Add(int num1, int num2) {
		setData(num1, num2);
		System.out.println("I'm in Two Args Constructor!");
	}
	
	public void setData(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public void calculate() {
		this.number3 = this.number1 + this.number2;
	}
	
	public int getData() {
		return this.number3;
	}
	
	public void displayData() {
		System.out.println("Num1 = " + number1 + " Num2 = " + number2 + " Num3 = " + number3);
	}
	
	protected void finalize() {
		System.out.println("I'm getting deleted!");
	}

}
