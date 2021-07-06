package com.sapient.week1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConvertor 
{

    public static void main(String[] args) 
    {
        System.out.println(" Country Codes : \n1. America \n2. UK \n3.India \n4.Japan \n Enter Source Country code: ");
        Scanner scanner = new Scanner(System.in);
        int fromCountry= scanner.nextInt();

        System.out.println("\nEnter Target country Code :");
        int target=scanner.nextInt();
        Map<Integer,Double> currencyMap=new HashMap<Integer,Double>();  
         
            // map contains country code - ( 1 currency of that country equals to how many dollars)
            // 1 INR = 1.49314 JPY
            // 1 INR = 0.0134564 USD
            // 1 INR = 0.00968911 GBP
            // Default Currency is USD

         currencyMap.put(1, 1.0d);
         currencyMap.put(2, 1.39d);
         currencyMap.put(3, 0.013d);
         currencyMap.put(4, 0.009d);
         
         System.out.println("\n Enter the amount to be converted:");
         int currency = scanner.nextInt();
         double defaultCurrency;
         defaultCurrency = currency*(currencyMap.get(fromCountry)); // given amount  in source country currency is converted to dollars
         
         double ans = defaultCurrency/(currencyMap.get(target)); // dollar is converted to target country currency
         System.out.println("Converted amount = " + ans);
    }

}