package com.sapient;

import java.util.HashMap;
import java.util.Map;

public class Currency {
	
	private static final Map<String, Double> CURRENCIES = new HashMap<>() {{
			put("INR", 74.26);
			put("USD", 1.0);
			put("POUND", 0.72);
			put("YEN", 110.90);
		}};
	
	private String code;
	private double value;
	
	
	public Currency() {
		super();
	}
	
	public void setCode(String code) 
	{
		this.code = code;
		this.value = CURRENCIES.get(code);
	}
	
	public String getCode() {
		return code;
	}

	public double getValue() {
		return value;
	}
	
	
}
