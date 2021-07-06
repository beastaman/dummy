package com.sapient;

import java.util.Scanner;

public class demo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long num = sc.nextLong();
		numbersToWords obj = new numbersToWords();
		System.out.println(obj.getWords(num));
	}
}
