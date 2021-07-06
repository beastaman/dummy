package com.dayfour;

import com.dayfour.MathematicalOperation;
import com.dayfour.Read;

class Calculation {
	//prototype
	public static MathematicalOperation getMethod(int choice,double n1,double n2) {
		if(choice == 1)
			return new Addition(n1, n2);
		else if(choice == 2)
			return new Subtraction(n1, n2);
		else if(choice == 3)
			return new Multiplication(n1, n2);
		else
			return new Division(n1, n2);
	}
	
	static MathematicalOperation a1=null,a2=null,a3=null,a4=null;
	public static MathematicalOperation getMethodSingleton(int choice,double n1,double n2) {
		if(choice == 1)
		{
			if(a1 == null)
			return new Addition(n1, n2);
			return a1;
		}
		else if(choice == 2)
		{
			if(a2==null)
			return new Subtraction(n1, n2);
			return a2;
		}
		else if(choice == 3)
		{
			if(a3==null)
			return new Multiplication(n1, n2);
			return a3;
		}
		else if(choice==4)
		{
			if(a4==null)
			return new Division(n1, n2);
			return a4;
		}
		else 
			return null;
	}
}
public class DemoFactoryDP {

	public static void main(String[] args) {
		System.out.println("Enter Two Numbers : ");
		int num1=Read.scanner.nextInt();
		int num2=Read.scanner.nextInt();
		System.out.println("Enter choice which operation to perform : ");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		int choice=Read.scanner.nextInt();
	    MathematicalOperation obj = Calculation.getMethod(choice, num1, num2);
	    obj.calculate();
	    obj.displayData();
	    obj = Calculation.getMethodSingleton(choice, num1, num2);
	    obj.calculate();
	    obj.displayData();
	}

}
