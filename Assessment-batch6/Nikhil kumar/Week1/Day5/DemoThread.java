package com.sapient.day5;

import java.util.Arrays;

class Thread1 extends Thread{
    String name;
    int n;
    Thread1(String s, int n){
        this.name=s;
        this.n=n;
    }
    @Override
    public void run(){
        for (int i=1;i<=n;i++){
            System.out.println(name+" "+i);
            try {
                sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e.getLocalizedMessage());
            }
        }
    }
}
public class DemoThread {
    public static void main(String[] args) {
        Thread1 g1 = new Thread1("TCS",1);
        Thread1 g2 = new Thread1("Wipro",10);
        Thread1 g3 = new Thread1("Sapient",20);
        g1.start();
        g2.start();
        g3.start();
    }
}
