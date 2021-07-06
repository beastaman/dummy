package com.day4;

interface b1 {
    void f1();
}

interface b2 {
    void f2();
}

interface b3 {
    void f3();
}

public abstract class Bridge implements b1, b2 {
    public void f4() {
        System.out.println("I am in abstract class bridge f4");
    }
}

class Actual1 extends Bridge {

    @Override
    public void f1() {
        System.out.println("I am in bridge f1");
    }

    @Override
    public void f2() {
        System.out.println("I am in bridge f2");
    }
}