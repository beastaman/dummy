package com.company;

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

        HashMap<String, Double> exchangeValues = new HashMap<String, Double>();

        Currency currency = new Currency(s1, s2, exchangeValues);
        currency.defaultValues();
        System.out.println(currency.compute(s2, amt));
    }
}
