package com.anuragweek1;

public class Multiplication extends Arithmetic {

	public Multiplication(double num1, double num2) {
		super(num1, num2);
	}
	
	@Override
	public void calculate() {
		this.num3 = this.num1 * this.num2;
	}
}