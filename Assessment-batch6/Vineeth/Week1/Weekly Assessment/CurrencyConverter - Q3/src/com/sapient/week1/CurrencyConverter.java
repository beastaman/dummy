package com.sapient.week1;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {

	private static Map<String, Double> valueInIndia;
	
	static {
		valueInIndia = new HashMap<>(); // Values of Different Country currency in INR
		valueInIndia.put("AMERICA", 74.27);
		valueInIndia.put("UK", 103.14);
		valueInIndia.put("JAPAN", 0.67);
		valueInIndia.put("INDIA", 1.0);
	}
	
	public static Double convert(String sourceCountry, String targetCountry, Double amount) {
		sourceCountry = sourceCountry.toUpperCase();
		targetCountry = targetCountry.toUpperCase();
		double convertedAmount = amount*valueInIndia.get(sourceCountry)/valueInIndia.get(targetCountry);
		return convertedAmount;
	}

}
