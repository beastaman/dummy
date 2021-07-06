package com.sapient;

import java.util.ArrayList;
import java.util.List;

public class CurrencyFactory {
	
	public static Currency getCurrency(int choice) {
		
		List<String> currencyCodes = new ArrayList<>();
		currencyCodes.add("USD");
		currencyCodes.add("POUND");
		currencyCodes.add("INR");
		currencyCodes.add("YEN");
		
		
		Currency currency = new Currency();
		currency.setCode(currencyCodes.get(choice-1));
		
		return currency;
	}
	
}
