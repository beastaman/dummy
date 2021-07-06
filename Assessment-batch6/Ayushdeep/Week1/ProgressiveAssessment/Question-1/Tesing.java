package com.company;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;

public class Tesing extends TestCase {
	 @Test
		public void testEvenNumber(){
			CheckEven checkEven = new CheckEven();
		 	Assert.assertEquals("15 is Odd", 15, checkEven.check(15));
		}
	 @Test
		 public void testOddNumber() {
			 CheckEven checkEven = new CheckEven();
		 Assert.assertEquals("17 is Odd", 17, checkEven.check(17));
		 }
	 @Test
		 public void testZero() {
			 CheckEven checkEven = new CheckEven();
		 	Assert.assertEquals("10 is Even", 10, checkEven.check(10));
		 }
	 
}
