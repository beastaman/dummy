package com.sapient;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Demo {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String... args) {
        AdditionOfTwoNumbers additionOfTwoNumbers = new AdditionOfTwoNumbers();
        // System.out.println(additionOfTwoNumbers.getAddition(Read.scanner.nextInt(),Read.scanner.nextInt()));
        // System.out.println(additionOfTwoNumbers.getAddition(Read.scanner.next().charAt(0),Read.scanner.next().charAt(0)));
        // System.out.println(additionOfTwoNumbers.getAddition(Read.scanner.next(),
        // Read.scanner.next()));

        // Assignment - 01 (Operations using Runtime Polymorphism)
        // Factory Design Pattern
        AirthmeticOperation operation = null;
        System.out.println("Please Enter Two numbers to perform airthmetic operation");
        System.out.print("Enter number 1: ");
        int n1 = Read.scanner.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = Read.scanner.nextInt();
        System.out.println("Please select the operation");
        System.out.println("Type 1 for addition");
        System.out.println("Type 2 for multiplication");
        System.out.println("Type 3 for division");
        System.out.println("Type 4 for Subtraction");
        int choice = Read.scanner.nextInt();
        switch (choice) {
            case 1:
                operation = new Addition(n1, n2);
                operation.calculate();
                break;
            case 2:
                operation = new Multiplication(n1, n2);
                operation.calculate();
                break;
            case 3:
                operation = new Division(n1, n2);
                operation.calculate();
                break;
            case 4:
                operation = new Subtraction(n1, n2);
                operation.calculate();
                break;
            default:
                operation = new Addition(n1, n2);
                operation.calculate();
                break;
        }
        operation.dispaly();
    }

}