package com.sapient.day4;

public class Addition extends AirthmeticOperation {
    public Addition(int n1, int n2){
       super(n1,n2);
    }

    @Override
    public void calculate() {
        this.res = this.num1+this.num2;
    }
}
