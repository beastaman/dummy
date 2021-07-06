package com.day4;

public class DemoAdapter {
    public static void main(String[] args) {
        // Adapter adapter = new Actual();
        // adapter.f1();
        //
        Bridge bridge = new Actual1();
        bridge.f1();
        bridge.f2();
        bridge.f4();
    }
}