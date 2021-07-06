package com.week1.Assignment1;

public abstract class Arithmetic {
	int num1;
	int num2;
	int num3;
	
	public void setData (int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void display() {
		System.out.println(this.num3);
	}
	
	public int getData() {
		 return this.num3;
	}
	
	public abstract void calculate(int num1,int num2);
}

