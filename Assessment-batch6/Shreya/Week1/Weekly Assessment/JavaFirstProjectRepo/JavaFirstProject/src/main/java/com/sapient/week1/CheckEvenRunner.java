package com.sapient.week1;

import java.util.Scanner;

public class CheckEvenRunner {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number you want to check if even or not");
		int num = scanner.nextInt();
		CheckEven checkEven= new CheckEven();
		Boolean var= checkEven.check(num);
		if(var==true)
		  System.out.println("The number you entered is even");
		else
			System.out.println("The number is odd");
		scanner.close();
	}

}
