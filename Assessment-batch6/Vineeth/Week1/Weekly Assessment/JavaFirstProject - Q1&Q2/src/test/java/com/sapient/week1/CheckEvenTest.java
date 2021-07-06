package com.sapient.week1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CheckEvenTest {

	private static CheckEven checkEven = new CheckEven();

	@Test
	public void test1() {
		boolean expected = true;
		boolean actual = checkEven.check(8);
		assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		boolean expected = false;
		boolean actual = checkEven.check(7);
		assertEquals(expected, actual);
	}

	@Test
	public void test3() {
		boolean expected = false;
		boolean actual = checkEven.check(1245);
		assertEquals(expected, actual);
	}

	@Test
	public void test4() {
		boolean expected = true;
		boolean actual = checkEven.check(3478);
		assertEquals(expected, actual);
	}

}
