package com.sapient.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Demo1 {
    @Autowired private Detail1 detail1;

    public static void main(String[] args) {
        new Demo1().detail1.display();
    }
}
