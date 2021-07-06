package com.sapient.week1.ArithmeticOperation;

public class ArithmeticMain {
	public static void main(String[] args) {
		System.out.println("Enter your choice of operation : ");
		System.out.println("1 = Add\n2 = Sub\n3 = Mul\n4 = Div");
		
		int choice = Read.scanner.nextInt();
		
		System.out.println("Enter two numbers : ");
		
		int num1 = Read.scanner.nextInt();
		int num2 = Read.scanner.nextInt();
		
		Arithmetic op = ArithmeticFactory.getArithmeticObject(choice);
		
		if(choice < 1 || choice > 4) {
			System.out.println("Please enter correct choice of operation");
			return;
		}
		op.setData(num1, num2);
		op.calculate();
		op.display();
	}
}
