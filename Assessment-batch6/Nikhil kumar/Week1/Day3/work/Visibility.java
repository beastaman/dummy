package com.sapient.day3.work;

public class Visibility {
    private int a1=10;
    int a2 = 20;
    protected int a3 = 30;
    public int a4 = 40;

    public Visibility(){

    }

    private void f1(){
        System.out.println("I am in com.sapient.day3.f1");
    }
    void f2(){
        System.out.println("I am in f2");
    }
    protected void f3(){
        System.out.println("I am in f3");
    }
    public void f4(){
        System.out.println("I am in f4");
    }
}
