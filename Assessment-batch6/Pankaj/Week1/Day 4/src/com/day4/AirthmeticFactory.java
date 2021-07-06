package com.day4;

import com.day3.work.Division;

public class AirthmeticFactory {
    //Prototype
    public static AirthmeticOperation getAirthmeticFactory(int choice, int num1, int num2){
        if(choice==1) return new Addition(num1,num2);
        else if(choice==2) return new Subtraction(num1,num2);
        else if(choice==3) return new Multiplication(num1,num2);
        else if(choice==4) return new Division(num1,num2);
        else return null;
    }

    //Singleton
    static AirthmeticOperation a1 = null, a2 = null,a3 = null,a4 = null;
    public static AirthmeticOperation getAirthmeticFactorySingleton(int choice, int num1, int num2){
        if(choice==1) {
            if(a1==null){
                a1 = new Addition(num1,num1);
            }
            return a1;
        } else if(choice==2) {
            if(a2==null){
                a2 = new Subtraction(num1,num2);
            }
            return a2;
        } else if(choice==3) {
            if(a3==null){
              a3 = new Multiplication(num1,num2);
            }
            return a3;
        } else if(choice==4) {
            if(a4 == null){
                a4 = new Division(num1, num2);
            }
            return a4;
        } else return null;
    }
}
