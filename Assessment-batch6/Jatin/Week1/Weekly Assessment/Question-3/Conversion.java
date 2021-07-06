package com.sapient.currencyConverter;


public class Conversion {
	private String countryFrom;
	private String countryTo;
	private Double amount;

	public Conversion(String countryFrom, String countryTo, Double amount) {
		super();
		this.countryFrom = countryFrom;
		this.countryTo = countryTo;
		this.amount = amount;
	}

	public Double compute() {
		CurrencyAndCountry obj1 = new CurrencyAndCountry();

		return (obj1.value(this.countryFrom, countryTo)) * amount;
	}
}
