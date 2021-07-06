package com.anuragweek1;


public class Addition extends Arithmetic {

	public Addition(double num1, double num2) {
		super(num1, num2);
	}
	
	@Override
	public void calculate() {
		this.num3 = this.num1 + this.num2;
	}
}