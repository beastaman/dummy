package com.sapient;

public class Converter {

	private static String[] ones = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
									 "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
									 "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty" };
	
	private static String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty" };
	
	private static String[] units = { "", "", "", "Hundred", "Thousand", "Lakh", "Crore" };
	
	public static String convertNumberToWord(int n) {
		if (n <= 20) return ones[n];
		if (n < 100) return tens[n/10] + " " + convertNumberToWord(n%10);
		if (n < 1000) return ones[n/100] + " " + units[3] + " " + convertNumberToWord(n%100);
		if (n < 100000) return convertNumberToWord(n/1000) + " " + units[4] + " " + convertNumberToWord(n%1000);
		if (n < 10000000) return convertNumberToWord(n/100000) + " " + units[5] + " " + convertNumberToWord(n%100000);
		if (n < 1000000000) return convertNumberToWord(n/10000000) + " " + units[6] + " " + convertNumberToWord(n%10000000);
		return "Very Big Number";
	}

	public static void main(String[] args) {

		System.out.println(8 + " : " + Converter.convertNumberToWord(8));
		System.out.println(14 + " : " + Converter.convertNumberToWord(14));
		System.out.println(279 + " : " + Converter.convertNumberToWord(279));
		System.out.println(35165 + " : " + Converter.convertNumberToWord(35165));
		System.out.println(785302 + " : " + Converter.convertNumberToWord(785302));
		System.out.println(5321658 + " : " + Converter.convertNumberToWord(5321658));
		System.out.println(98456123 + " : " + Converter.convertNumberToWord(98456123));
		System.out.println(187562341 + " : " + Converter.convertNumberToWord(187562341));
		System.out.println(1977562341 + " : " + Converter.convertNumberToWord(1977562341));
	}

}
