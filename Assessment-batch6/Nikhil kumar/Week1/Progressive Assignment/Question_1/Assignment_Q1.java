package com.sapient;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


interface Calculator {
    int cal(int n1, int n2);
}

abstract class Arithmetic {
    public int n1, n2;
    public double res;
    public void setData(int n1,int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public abstract void calculate();
    public void display(){
        System.out.println("Airthmetic Operation Result: "+res);
    }

    //for lambda implementation
    public void calculate(Calculator calculator){
        res = calculator.cal(n1,n2);
    }
}

class Addition extends Arithmetic {
    @Override
    public void calculate() {
        res = n1+n2;
    }
}

class Subtraction extends Arithmetic {
    @Override
    public void calculate() {
        res = n1-n2;
    }
}

class Multiplication extends Arithmetic {
    @Override
    public void calculate() {
        res = n1*n2;
    }
}
class Division extends Arithmetic {
    @Override
    public void calculate() {
        res = n1*1.0/n2;
    }
}

class ArithmeticFactory{
    public final static List<Arithmetic> operation = Arrays.asList(new Addition(),new Subtraction(),new Multiplication(),new Division());
    public static Arithmetic getChoicedOperation(int choice){
        return choice>=1 && choice<=4 ? operation.get(choice-1) : null;
    }
}

public class Assignment_Q1 {
    private final static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //Input
        System.out.println("Enter two numbers to perform airthmetic operations");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        System.out.println("Type  1 for addition");
        System.out.println("Type  2 for subtraction");
        System.out.println("Type  3 for multiplication");
        System.out.println("Type  4 for division");
        int choice = scan.nextInt();

        //Using Factory Pattern (GOF) without loops or if-else
        System.out.println("Using Factory Pattern Method Result");
        Arithmetic obj = ArithmeticFactory.getChoicedOperation(choice);
        obj.setData(n1,n2);
        obj.calculate();
        obj.display();

        //Using Factory Pattern with Lambda
        System.out.println("Using Factory Pattern with Lambda Results");
        List<Calculator> calculators = Arrays.asList((a,b) -> a+b, (a,b) -> a-b, (a,b) -> a*b,(a,b) -> a/b);
        obj = ArithmeticFactory.getChoicedOperation(choice);
        obj.setData(n1,n2);
        obj.calculate(calculators.get(choice-1));
        obj.display();
    }
}

