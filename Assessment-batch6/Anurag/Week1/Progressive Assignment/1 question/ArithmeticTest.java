package com.anuragweek1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


	class ArithmeticTest {

		@Test
		void test1() {
			Arithmetic operation = Factory.getArithmetic(10.0, 20.0, 1);
			operation.calculate();
			double actual = operation.getData();
			double expected = 30;
			assertEquals(expected, actual);
		}

		@Test
		void test2() {
			Arithmetic operation = Factory.getArithmetic(10.0, 20.0, 2);
			operation.calculate();
			double actual = operation.getData();
			double expected = -10;
			assertEquals(expected, actual);
		}

		@Test
		void test3() {
			Arithmetic operation = Factory.getArithmetic(10.0, 20.0, 3);
			operation.calculate();
			double actual = operation.getData();
			double expected = 200;
			assertEquals(expected, actual);
		}

		@Test
		void test4() {
			Arithmetic operation = Factory.getArithmetic(10.0, 20.0, 4);
			operation.calculate();
			double actual = operation.getData();
			double expected = 0.5;
			assertEquals(expected, actual);
		}
	}