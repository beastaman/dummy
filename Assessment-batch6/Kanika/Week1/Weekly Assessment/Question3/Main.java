package com.sapient;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println("Enter the amount: ");
        double amt = Double.parseDouble(sc.next());

        HashMap<String, Double> currencyExchange = new HashMap<String, Double>();

        Currency currency = new ConvertCurrency(s1, s2, currencyExchange);
        currency.defaultValues();
        System.out.println(currency.compute(s2, amt));
    }
}
