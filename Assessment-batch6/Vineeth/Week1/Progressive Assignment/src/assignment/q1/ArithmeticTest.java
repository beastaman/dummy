package assignment.q1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmeticTest {

	@Test
	void test1() {
		Arithmetic op = Factory.getArithmetic(10.0, 20.0, 1);
		op.calculate();
		double actual = op.getData();
		double expected = 30;
		assertEquals(expected, actual);
	}

	@Test
	void test2() {
		Arithmetic op = Factory.getArithmetic(10.0, 20.0, 2);
		op.calculate();
		double actual = op.getData();
		double expected = -10;
		assertEquals(expected, actual);
	}

	@Test
	void test3() {
		Arithmetic op = Factory.getArithmetic(10.0, 20.0, 3);
		op.calculate();
		double actual = op.getData();
		double expected = 200;
		assertEquals(expected, actual);
	}

	@Test
	void test4() {
		Arithmetic op = Factory.getArithmetic(10.0, 20.0, 4);
		op.calculate();
		double actual = op.getData();
		double expected = 0.5;
		assertEquals(expected, actual);
	}
}
