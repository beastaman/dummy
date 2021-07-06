package com.week1.Assignment1;

public class Div extends Arithmetic{

	@Override
	public void calculate(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("num2 should not be zero!");
			this.num3 = -1;
		}
		else this.num3 = num1 / num2;
	}
	
}
