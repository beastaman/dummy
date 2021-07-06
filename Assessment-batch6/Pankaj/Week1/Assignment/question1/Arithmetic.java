package com.question1;

public abstract class Arithmetic {

	double num1, num2, num3;

	public void setData(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public abstract void calculate();

	public abstract void calculate(Calculator calculator);

	public void display() {
		System.out.println("first number is " + this.num1 + " second number is " + this.num2 + " third number is " + this.num3);
	}

	public double getNum3() {
		return num3;
	}
}

class Add extends Arithmetic {

	@Override
	public void calculate() {
		this.num3 = this.num1 + this.num2;
	}

	@Override
	public void calculate(Calculator calculator) {
		this.num3 = calculator.calculate(this.num1, this.num2);

	}
}

class Sub extends Arithmetic {

	@Override
	public void calculate() {
		this.num3 = this.num1 - this.num2;
	}

	@Override
	public void calculate(Calculator calculator) {
		this.num3 = calculator.calculate(this.num1, this.num2);

	}
}

class Mul extends Arithmetic {

	@Override
	public void calculate() {
		this.num3 = this.num1 * this.num2;
	}

	@Override
	public void calculate(Calculator calculator) {
		this.num3 = calculator.calculate(this.num1, this.num2);

	}
}

class Div extends Arithmetic {

	@Override
	public void calculate() {
		this.num3 = this.num1 / this.num2;
	}

	@Override
	public void calculate(Calculator calculator) {
		this.num3 = calculator.calculate(this.num1, this.num2);
	}
}
