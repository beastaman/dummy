package com.sapient.demo1;

import org.springframework.beans.factory.annotation.Autowired;

public class Demo4 {
    @Autowired
    public static Details2 details2;

    public static void main(String[] args) {
        details2.display();
    }
}
