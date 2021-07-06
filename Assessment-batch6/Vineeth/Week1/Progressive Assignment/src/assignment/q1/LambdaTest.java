package assignment.q1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LambdaTest {

	private static Lambda lambda = (double num1, double num2, int choice) -> {
		
		Arithmetic[] ops = new Arithmetic[5];

		ops[1] = new Add(num1, num2);
		ops[2] = new Sub(num1, num2);
		ops[3] = new Mul(num1, num2);
		ops[4] = new Div(num1, num2);
		
		return ops[choice];
	};

	@Test
	void test1() {
		Arithmetic op = lambda.getArithmetic(10.0, 20.0, 1);
		op.calculate();
		double actual = op.getData();
		double expected = 30;
		assertEquals(expected, actual);
	}

	@Test
	void test2() {
		Arithmetic op = lambda.getArithmetic(10.0, 20.0, 2);
		op.calculate();
		double actual = op.getData();
		double expected = -10;
		assertEquals(expected, actual);
	}

	@Test
	void test3() {
		Arithmetic op = lambda.getArithmetic(10.0, 20.0, 3);
		op.calculate();
		double actual = op.getData();
		double expected = 200;
		assertEquals(expected, actual);
	}

	@Test
	void test4() {
		Arithmetic op = lambda.getArithmetic(10.0, 20.0, 4);
		op.calculate();
		double actual = op.getData();
		double expected = 0.5;
		assertEquals(expected, actual);
	}

}
