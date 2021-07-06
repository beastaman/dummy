package com.sapient.day3;

public class AdditionOfTwoNumber {
	private int number1;
	private int number2;

	public AdditionOfTwoNumber(int number1) {
		this.number1 = this.number2 = number1;
	}
	public AdditionOfTwoNumber(int num1, int num2) {
		this.number1 = num1;
		this.number2 = num2;
	}

	public int numbersSum() {
		return number1 + number2;
	}

	@Override
	protected void finalize() {
		System.out.println("The object is destroyed");
	}

}
