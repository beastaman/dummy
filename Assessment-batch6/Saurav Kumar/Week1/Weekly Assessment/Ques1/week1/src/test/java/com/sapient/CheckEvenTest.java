package com.sapient;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheckEvenTest {

	@Test
	public void test1() {
		assertEquals(true, new CheckEven().check(20));
	}
	
	@Test
	public void test2() {
		assertEquals(false, new CheckEven().check(19));
	}
	
	@Test
	public void test3() {
		assertEquals(false, new CheckEven().check(5));
	}
	
	@Test
	public void test4() {
		assertEquals(true, new CheckEven().check(8));
	}
	
	
}
