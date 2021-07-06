package com.sapient.operation;

public abstract class CalculateTwoNumber implements Calculate {
	
	protected int num1;
	protected int num2;
	public int result;
	
	public CalculateTwoNumber(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	@Override
	public abstract void run();
	
	public int getResult() {
		return this.result;
	}

}
