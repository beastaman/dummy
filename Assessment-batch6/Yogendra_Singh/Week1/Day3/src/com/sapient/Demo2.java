package com.sapient;

public class Demo2 {

	public static void main(String[] args) {
		long num=Read.scanner.nextInt();
		IntToWords obj= new IntToWords(num);
		obj.covertIntToWords();
		obj.displayInWords();
	}

}
