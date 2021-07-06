package com.sapient;

import java.util.Scanner;


public class LambdaExpressionDemo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		

		int num1,num2,choice;
		num1=sc.nextInt();
		num2=sc.nextInt();
		choice=sc.nextInt();
		
		LambdaI add = (a,b) -> (a+b);
		
		System.out.println(add.cal(10,20));

		LambdaI sub = (a,b) -> (a-b);
		
		Arithmetic obj[] = new Arithmetic[4];
        obj[0] = ArithmeticFactory.getAirthmeticFactory(1, num1, num2);
        obj[1] = ArithmeticFactory.getAirthmeticFactory(2, num1, num2);
        obj[2] = ArithmeticFactory.getAirthmeticFactory(3, num1, num2);
        obj[3] = ArithmeticFactory.getAirthmeticFactory(4, num1, num2);

        obj[choice-1].calculate();
        obj[choice-1].display();
		
        sc.close();
	}

}
