package com.sachinweek1assignment;

public class Division extends Arithmetic {

	public Division(double num1, double num2) {
		super(num1, num2);
	}
	
	@Override
	public void calculate() {
		this.num3 = this.num1 / this.num2;
	}
}