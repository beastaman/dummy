package com.sapient;

import com.sapient.operation.Add;
import com.sapient.operation.CalculateTwoNumber;
import com.sapient.operation.Divide;
import com.sapient.operation.Multiply;

public class q1 {
	
	public static void main(String args[]) {
		
		int num1 = Read.scanner.nextInt();
		int num2 = Read.scanner.nextInt();
		
		CalculateTwoNumber obj;
		
		obj = new Add(num1, num2);
		obj.run();
		System.out.println("Result = " + obj.getResult());
		
		obj = new Multiply(num1, num2);
		obj.run();
		System.out.println("Result = " + obj.getResult());
		
		obj = new Divide(num1, num2);
		obj.run();
		System.out.println("Result = " + obj.getResult());
	}
	
}
