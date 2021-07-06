package com.sapient.week1;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class CheckEvenTest extends TestCase
{
    /**
     * Rigorous Test :-)
     */

    public void test1()
    {
    	CheckEven obj = new CheckEven();
	assertEquals(true,obj.check(6));
    }
    public void test2()
    {
    	CheckEven obj = new CheckEven();
	assertEquals(false,obj.check(5));
    }
    public void test3()
    {
    	CheckEven obj = new CheckEven();
	assertEquals(true,obj.check(0));
    }
    public void test4()
    {
    	CheckEven obj = new CheckEven();
	assertEquals(false,obj.check(-5));
    }
}
