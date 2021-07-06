package com.sapient;

class CalculationFactory {
public Calculation getFactory(int choice){

    if(choice==1){
        return new Addition(num1,num2);
    }
    else if(choice==2){
        return new Subtraction(num1,num2);
    }
    else if (choice==3){
        return new Multiplication(num1,num2);
    }
    else (choice==4){
        return new Division(num1,num2);
    }
  }
}

public class FactoryDemoDP {
    public static void main(String[] args) {

    }

}
