package com.sapient.operation;

public class Add extends CalculateTwoNumber {
	
	public Add(int num1, int num2) {
		super(num1, num2);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.result = this.num1 + this.num2;
	}
}
