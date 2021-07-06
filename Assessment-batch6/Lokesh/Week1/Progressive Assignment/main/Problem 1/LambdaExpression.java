package com.week1.Problem1;

public class LambdaExpression {

	public int getInstance(int num1, int num2, Character ch) {
		ArithmeticLambdaExp operation;
		if(ch == '+') {
			operation = (a,b) ->(a+b);
			return operation.calculate(num1, num2);
		}
		else if(ch == '-') {
			operation = (a,b) ->(a-b);
			return operation.calculate(num1, num2);
		}
		else if(ch == '*') {
			operation = (a,b) ->(a*b);
			return operation.calculate(num1, num2);
		}
		else if(ch == '/') {
			if(num2 == 0) return -1;
			operation = (a,b) ->(a/b);
			return operation.calculate(num1, num2);
		}
		return -1;
	}
}
