package com.sachinweek1assignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LambdaTesting {

	private static LambdaExpression lambda = (double num1, double num2, int choice) -> {
		
		Arithmetic[] operation = new Arithmetic[5];

		operation[1] = new Add(num1, num2);
		operation[2] = new Sub(num1, num2);
		operation[3] = new Mul(num1, num2);
		operation[4] = new Div(num1, num2);
		
		return operation[choice];
	};

	@Test
	void test1() {
		Arithmetic operation = lambda.getArithmetic(10.0, 20.0, 1);
		operation.calculate();
		double actual = operation.getData();
		double expected = 30;
		assertEquals(expected, actual);
	}

	@Test
	void test2() {
		Arithmetic operation = lambda.getArithmetic(10.0, 20.0, 2);
		operation.calculate();
		double actual = operation.getData();
		double expected = -10;
		assertEquals(expected, actual);
	}

	@Test
	void test3() {
		Arithmetic operation = lambda.getArithmetic(10.0, 20.0, 3);
		operation.calculate();
		double actual = operation.getData();
		double expected = 200;
		assertEquals(expected, actual);
	}
	
}