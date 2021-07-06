package com.sapient;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        int n1 = Read.scanner.nextInt();
        int n2 = Read.scanner.nextInt();
        System.out.println("Enter choice");
        int ch = Read.scanner.nextInt();
        // Gang of four design pattern
        AirthmeticOperation obj[] = new AirthmeticOperation[4];
        obj[0] = new Addition(n1, n2);
        obj[1] = new Subtraction(n1, n2);
        obj[2] = new Multiplication(n1, n2);
        obj[3] = new Division(n1, n2);

        obj[ch - 1].calculate();
        obj[ch - 1].dispaly();
    }
}