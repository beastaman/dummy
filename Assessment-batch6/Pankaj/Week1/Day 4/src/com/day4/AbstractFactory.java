package com.day4;

public class AbstractFactory {
    public static AirthmeticFactory getFactory(int choice){
        if(choice==1){
            return new AirthmeticFactory();
        }else {
            return null;
        }
    }
}


