package com.sapient;

public class Div extends Arithmetic{

	public Div(int num1, int num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculate() {
		num3=(double)num1/(double)num2;
	}

}
