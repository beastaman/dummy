package com.sapient.week1;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	 @Test
	    public void testEvenNumber(){
	        CheckEven meo = new CheckEven();
	        assertEquals("10 is an even number", true, meo.check(10));
	    }
	 @Test
	 public void testOddNumber() {
		 CheckEven obj = new CheckEven();
		 assertEquals("5 is an odd number", false, obj.check(5));
	 }
	 @Test
	 public void testZero() {
		 CheckEven obj = new CheckEven();
		 assertEquals("5 is an even number", true, obj.check(0));
	 }
	 
}
