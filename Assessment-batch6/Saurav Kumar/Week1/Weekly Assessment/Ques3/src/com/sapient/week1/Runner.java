package com.sapient.week1;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter countries among America, UK, India and Japan ");
		System.out.println();
		
		System.out.println("Enter Source country ");
		String sourceCountry = sc.next();
		
		System.out.println("Enter Target country ");
		String targetCountry = sc.next();
		
		System.out.println("Enter amount ");
		double amount = sc.nextDouble();
		
		String key = sourceCountry + "-" + targetCountry;
		System.out.println("Coverted amount is : " + new CurrencyConverter().convertedAmount(key, amount));
	}
}
