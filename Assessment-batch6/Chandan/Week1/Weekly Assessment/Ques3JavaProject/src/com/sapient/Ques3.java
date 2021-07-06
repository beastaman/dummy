package com.sapient;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		
		
		System.out.println("Currency Converter-----------");
		
		
		System.out.println("1.USD\t2.POUND\t3.INR\t4.YEN");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Currency 1 Choice (Integer)");
		int curr1Ch = scanner.nextInt();
		
		System.out.println("Enter Currency 2 Choice (Integer)");
		int curr2Ch = scanner.nextInt();
		
		
		System.out.println("Enter Amount");
		float amount = scanner.nextFloat();
			
		
		Currency curr1 = CurrencyFactory.getCurrency(curr1Ch);
		Currency curr2 = CurrencyFactory.getCurrency(curr2Ch);
		
		CurrencyConvert currencyConvert = new CurrencyConvertImpl();
		
		double result = currencyConvert.convertCurrency(amount, curr1, curr2);
		
		System.out.println(amount + " " + curr1.getCode() + " = " + result + " " + curr2.getCode());
		
		

	}

}
