package com.sapient.day4;

public class AirthmeticOperation implements Mathematics {
    int num1, num2;
    double res;
    public AirthmeticOperation(int n1, int n2){
        this.num1 = n1;
        this.num2 = n2;
    }
    public void calculate(){

    }

    @Override
    public void display() {
        System.out.println("Results: " + res);
    }
}
