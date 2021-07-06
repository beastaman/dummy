package com.sachinweek1assignment;

public abstract class Arithmetic {

	protected double num1;
	protected double num2;
	protected double num3;

	protected Arithmetic(double num1, double num2) {
		setData(num1, num2);
	}

	public void setData(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public abstract void calculate();
	
	public double getData() {
		return this.num3;
	}
	
	public void displayData() {
		System.out.println("Num1 = " + num1 + " Num2 = " + num2 + " Res = " + num3);
	}

}