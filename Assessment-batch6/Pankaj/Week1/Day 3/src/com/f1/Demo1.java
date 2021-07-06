package com.f1;

import com.sapient.Visibility;

public class Demo1 extends Visibility{
    public static void main(String[] args) {
        Visibility visibility = new Visibility();
//        System.out.println(visibility.a1); //private
//        System.out.println(visibility.a2); //default
//        System.out.println(visibility.a3); //protected
        System.out.println(visibility.a4); //public
//        visibility.f1();
//        visibility.f2();
//        visibility.f3();
        visibility.f4();
    }

    public void test(){
//        System.out.println(a1); //private
//        System.out.println(a2); //default
        System.out.println(a3); //protected
        System.out.println(a4); //public
//        f1();
//        f2();
        f3();
        f4();
    }
}
