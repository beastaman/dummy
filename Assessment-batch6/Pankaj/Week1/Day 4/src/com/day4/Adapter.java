package com.day4;

public interface Adapter {
    void f1();
    void f2();
    void f3();
}

class Adapter1 implements Adapter{

    @Override
    public void f1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }
}

class Actual extends Adapter1{
    @Override
    public void f1(){
        System.out.println("I am in f1");
    }
}