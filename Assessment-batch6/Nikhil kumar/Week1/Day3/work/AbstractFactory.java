package com.sapient.day3.work;

public class AbstractFactory {
    public static AirthmeticFactory getFactory(int choice){
        if(choice==1){
            return new AirthmeticFactory();
        }else {
            return null;
        }
    }
}


