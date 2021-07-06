package com.sapient.week1;

public class CurrencyConverterTest {

	public static void main(String[] args) {

		System.out.printf("10 Inidan Rupees in American Dollars : %.3f\n", CurrencyConverter.convert("India", "America", 10.0));
		System.out.printf("10 Inidan Rupees in UK Pounds : %.3f\n", CurrencyConverter.convert("India", "UK", 10.0));
		System.out.printf("10 Inidan Rupees in Japanese Yens : %.3f\n", CurrencyConverter.convert("India", "Japan", 10.0));
		System.out.printf("10 American Dollars in Inidan Rupees : %.3f\n", CurrencyConverter.convert("America", "India", 10.0));
		System.out.printf("10 American Dollars in UK Pounds : %.3f\n", CurrencyConverter.convert("America", "UK", 10.0));
		System.out.printf("10 American Dollars in Japanese Yens : %.3f\n", CurrencyConverter.convert("America", "Japan", 10.0));
		System.out.printf("10 UK Pounds in Inidan Rupees : %.3f\n", CurrencyConverter.convert("UK", "India", 10.0));
		System.out.printf("10 UK Pounds in American Dollars : %.3f\n", CurrencyConverter.convert("UK", "America", 10.0));
		System.out.printf("10 UK Pounds in Japanese Yens : %.3f\n", CurrencyConverter.convert("UK", "Japan", 10.0));
		System.out.printf("10 Japanese Yens in Indian Rupees : %.3f\n", CurrencyConverter.convert("Japan", "India", 10.0));
		System.out.printf("10 Japanese Yens in American Dollars : %.3f\n", CurrencyConverter.convert("Japan", "America", 10.0));
		System.out.printf("10 Japanese Yens in UK Pounds : %.3f\n", CurrencyConverter.convert("Japan", "UK", 10.0));
	}

}
