package com.sapient;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Assignment_Q1Test {

    private Arithmetic obj;
    private Calculator calculator;

    @Test
    public void checkAdd(){
        obj = ArithmeticFactory.getChoicedOperation(1);
        obj.setData(10,3);
        obj.calculate();
        obj.calculate();
        assertEquals(13, obj.res);
    }

    @Test
    public void checkAddLambda(){
        obj = ArithmeticFactory.getChoicedOperation(1);
        obj.setData(10,-2);
        obj.calculate((a,b)-> a+b);
        assertEquals(8, obj.res);

    }

    @Test
    public void checkSubtract(){
        obj = ArithmeticFactory.getChoicedOperation(2);
        obj.setData(10,5);
        obj.calculate();
        assertEquals(5, obj.res);
    }
    @Test
    public void checkSubtractLambda(){
        obj = ArithmeticFactory.getChoicedOperation(2);
        obj.setData(10,-2);
        obj.calculate((a,b)->a-b);
        assertEquals(12, obj.res);
    }

    @Test
    public void checkMultiply(){
        obj = ArithmeticFactory.getChoicedOperation(3);
        obj.setData(10,5);
        obj.calculate();
        assertEquals(50, obj.res);
    }

    @Test
    public void checkMultiplyLambda(){
        obj = ArithmeticFactory.getChoicedOperation(3);
        obj.setData(10,-2);
        obj.calculate((a,b) -> a*b);
        assertEquals(-20, obj.res);
    }

    @Test
    public void checkDivision(){
        obj = ArithmeticFactory.getChoicedOperation(4);
        obj.setData(10,5);
        obj.calculate();
        assertEquals(2.0, obj.res);
    }

    @Test
    public void checkDivisionLambda(){
        obj = ArithmeticFactory.getChoicedOperation(4);
        obj.setData(10,-2);
        obj.calculate((a,b) -> a/b);
        assertEquals(-5.0, obj.res);
    }
}