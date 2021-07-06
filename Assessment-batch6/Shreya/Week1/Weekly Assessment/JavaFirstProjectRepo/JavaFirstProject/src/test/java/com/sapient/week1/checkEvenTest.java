package com.sapient.week1;

import org.junit.Test;
import org.junit.Assert;

import junit.framework.TestCase;

public class checkEvenTest extends TestCase {

	@Test
	public void shouldReturnTrue_whenPassedEven() {
		CheckEven obj=new CheckEven();
		assertEquals(obj.check(4),true);
	}
	@Test
	public void shouldReturnFalse_whenOddIsPassed() {
		CheckEven obj=new CheckEven();
		assertEquals(obj.check(5),false);
	}
}
