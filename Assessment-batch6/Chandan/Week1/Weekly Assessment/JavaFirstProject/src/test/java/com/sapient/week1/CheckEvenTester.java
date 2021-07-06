package com.sapient.week1;

import org.junit.Test;

import junit.framework.TestCase;

public class CheckEvenTester extends TestCase {
	
	@Test
	public void test1() {
		CheckEven checkEven = new CheckEvenImpl();
		assertTrue(checkEven.check(2));
	}
	
	@Test
	public void test2() {
		CheckEven checkEven = new CheckEvenImpl();
		assertTrue(checkEven.check(16));
	}
	
	@Test
	public void test3() {
		CheckEven checkEven = new CheckEvenImpl();
		assertFalse(checkEven.check(5));
	}
	
	@Test
	public void test4() {
		CheckEven checkEven = new CheckEvenImpl();
		assertFalse(checkEven.check(99));
	}
	
}
