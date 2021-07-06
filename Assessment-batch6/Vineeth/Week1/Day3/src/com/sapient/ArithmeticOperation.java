package com.sapient;

public class ArithmeticOperation {

	protected double number1;
	protected double number2;
	protected double result;

	public ArithmeticOperation(double num1, double num2) {
		setData(num1, num2);
	}

	public void setData(double number1, double number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public void calculate() {
		this.result = 0;
	}
	
	public double getData() {
		return this.result;
	}
	
	public void displayData() {
		System.out.println("Num1 = " + number1 + " Num2 = " + number2 + " Res = " + result);
	}
	
	public static void main(String[] args) {

		ArithmeticOperation op;
		double a, b;
		
		System.out.print("\nEnter two numbers : ");
		a = Read.scanner.nextInt();
		b = Read.scanner.nextInt();

		op = new Addition(a, b);
		op.calculate();
		op.displayData();

		op = new Subtraction(a, b);
		op.calculate();
		op.displayData();
		
		op = new Multiplication(a, b);
		op.calculate();
		op.displayData();

		op = new Division(a, b);
		op.calculate();
		op.displayData();
	}
}

class Addition extends ArithmeticOperation {

	public Addition(double num1, double num2) {
		super(num1, num2);
	}
	
	@Override
	public void calculate() {
		this.result = this.number1 + this.number2;
	}
}

class Subtraction extends ArithmeticOperation {

	public Subtraction(double num1, double num2) {
		super(num1, num2);
	}
	
	@Override
	public void calculate() {
		this.result = this.number1 - this.number2;
	}
}

class Multiplication extends ArithmeticOperation {

	public Multiplication(double num1, double num2) {
		super(num1, num2);
	}
	
	@Override
	public void calculate() {
		this.result = this.number1 * this.number2;
	}
}

class Division extends ArithmeticOperation {

	public Division(double num1, double num2) {
		super(num1, num2);
	}
	
	@Override
	public void calculate() {
		this.result = this.number1 / this.number2;
	}
}
