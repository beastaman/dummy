package com.sapient.week1.ArithmeticOperation;

public class ArithmeticByLambda {
	
	public static int performOperation(int a, int b, Calculate cal) {
		return cal.getResult(a, b);
	}

	public static void main(String[] args) {
		
		System.out.println("Enter your choice of operation : ");
		System.out.println("1 = Add\n2 = Sub\n3 = Mul\n4 = Div");
		
		int choice = Read.scanner.nextInt();
		
		System.out.println("Enter two numbers : ");
		
		int num1 = Read.scanner.nextInt();
		int num2 = Read.scanner.nextInt();

		if(choice == 1) {
			System.out.println(performOperation(num1, num2, (a, b) -> (a+b)));
		} else if(choice == 2) {
			System.out.println(performOperation(num1, num2, (a, b) -> (a-b)));
		} else if(choice == 3) {
			System.out.println(performOperation(num1, num2, (a, b) -> (a*b)));
		} else if(choice == 4) {
			System.out.println(performOperation(num1, num2, (a, b) -> (a/b)));
		} else {
			System.out.println("Enter valid choice");
		}
	}

}
