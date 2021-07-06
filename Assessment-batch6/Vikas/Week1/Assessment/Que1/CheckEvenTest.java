package com.sapient.week1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckEvenTest {
	
	CheckEven checkeven = new CheckEven();

	@Test
	public void test() {
		assertEquals(true,checkeven.check(0));	
	}
	
	@Test
	public void test1() {
		assertEquals(true,checkeven.check(-64));	
	}
	
	@Test
	public void test2() {
		assertEquals(false,checkeven.check(31));	
	}
	
	@Test
	public void test3() {
		assertEquals(true,checkeven.check(98));	
	}
	
	@Test
	public void test4() {
		assertEquals(false,checkeven.check(-11));	
	}

}
