package com.sapient;

public class CurrencyConvertImpl implements CurrencyConvert {

	@Override
	public double convertCurrency(float amount, Currency curr1, Currency curr2) {
		
		double result = amount * curr2.getValue()/curr1.getValue();
		
		return Math.round(result*10000.0)/10000.0;
		
	}

}
