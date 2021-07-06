package com.sapient;

class Calculation {

	public int calculate(int number1, int number2) {
		return 0;
	}
}

class Subtraction extends Calculation {

	@Override
	public int calculate(int number1, int number2) {
		return number1 - number2;
	}

}

class Addition extends Calculation {

	@Override
	public int calculate(int number1, int number2) {
		return number1 + number2;
	}
}

class Multiplication extends Calculation {

	@Override
	public int calculate(int number1, int number2) {
		return number1 * number2;
	}

}

class Division extends Calculation {

	@Override
	public int calculate(int number1, int number2) {
		return number1 / number2;
	}

}
