package com.sapient;

public class ArithmeticFactory {

	public static Arithmetic getAirthmeticFactory(int choice, int num1, int num2){
        if(choice==1) return new Add(num1,num2);
        else if(choice==2) return new Sub(num1,num2);
        else if(choice==3) return new Mul(num1,num2);
        else if(choice==4) return new Div(num1,num2);
        else return null;
    }
}
