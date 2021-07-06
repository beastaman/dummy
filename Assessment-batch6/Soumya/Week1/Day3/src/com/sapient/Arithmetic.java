package com.sapient;

public class Arithmetic {

	private int number1, number2;

	public Arithmetic(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}

	public Arithmetic(int number1) {
		super();
		this.number1 = number1;
		this.number2 = 0;
	}

	public Arithmetic() {
		super();
		this.number1 = 0;
		this.number2 = 0;
	}

	public void setData(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;

	}

	public void setData(String number1, String number2) {
		this.number1 = Integer.parseInt(number1);
		this.number2 = Integer.parseInt(number2);
	}

	public int getData() {
		return number1 + number2;
	}

	public void displayData() {
		System.out.println(number1 + " + " + number2 + " = " + (this.number1 + this.number2));
	}

	@Override
	public void finalize() throws Throwable {
		System.out.println("destructor called");
	}
}
