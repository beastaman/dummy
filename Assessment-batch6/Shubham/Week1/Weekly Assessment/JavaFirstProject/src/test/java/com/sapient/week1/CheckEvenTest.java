package com.sapient.week1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckEvenTest {

	CheckEven ce=new CheckEven();
	@Test
	public void test1() {
		int num=40;
		boolean expected=true;
		boolean actual=ce.check(num);
		assertEquals(expected, actual);
	}
	@Test
	public void test2() {
		int num=0;
		boolean expected=true;
		boolean actual=ce.check(num);
		assertEquals(expected, actual);
	}
	@Test
	public void test3() {
		int num=1;
		boolean expected=false;
		boolean actual=ce.check(num);
		assertEquals(expected, actual);
	}
	@Test
	public void test4() {
		int num=41;
		boolean expected=false;
		boolean actual=ce.check(num);
		assertEquals(expected, actual);
	}

}
