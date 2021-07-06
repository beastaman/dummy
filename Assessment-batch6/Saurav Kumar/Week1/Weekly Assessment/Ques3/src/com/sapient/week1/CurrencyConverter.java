package com.sapient.week1;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
	private  Map<String, Double> rate;
	
	public CurrencyConverter() {
		rate = new HashMap<>();
		rate.put("America-UK", 0.72);
		rate.put("UK-America", 1.39);
		
		rate.put("America-India", 74.30);
		rate.put("India-America", 0.013);
		
		rate.put("America-Japan", 110.89);
		rate.put("Japan-America", 0.009);
		
		rate.put("India-UK", 0.0097);
		rate.put("UK-India", 103.32);
		
		rate.put("Japan-UK", 0.0065);
		rate.put("UK-Japan", 154.23);
		
		rate.put("India-Japan", 1.49);
		rate.put("Japan-India", 0.67);
		
	}
	
	public double convertedAmount(String string, double amount) {
		return (double)rate.get(string) * amount;
	}
}
