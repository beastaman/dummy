package com.sapient;

public class Multiplication extends ArithmeticOperation {
    public Multiplication(int n1, int n2) {
        super(n1, n2);
    }

    @Override
    public void calculate() {
        res = this.num1 * this.num2;
    }
}