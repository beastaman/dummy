package com.sapient.week1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckEvenTest {

    public CheckEven checkEven;

    @Before
    public void init(){
        checkEven = new CheckEven();
    }

    @Test
    public void check1() {
        assertEquals(true, checkEven.check(10));
    }

    @Test
    public void check2() {
        assertEquals(true, checkEven.check(12));
    }

    @Test
    public void check3() {
        assertEquals(false, checkEven.check(103451));
    }

    @Test
    public void check4() {
        assertEquals(false, checkEven.check(104445));
    }
}