package com.sapient.currencyConverter;

import java.util.HashMap;
import java.util.Map;

public class CurrencyAndCountry {
	private Map<Pair<String, String>, Double> container;

	public CurrencyAndCountry() {
		container = new HashMap<>();

		container.put(new Pair("AMERICA", "INDIA"), 74.30);
		container.put(new Pair("AMERICA", "UK"), 0.72);
		container.put(new Pair("AMERICA", "JAPAN"), 110.93);
		container.put(new Pair("INDIA", "AMERICA"), 0.013);
		container.put(new Pair("INDIA", "UK"), 0.0097);
		container.put(new Pair("INDIA", "JAPAN"), 1.49);
		container.put(new Pair("JAPAN", "AMERICA"), 0.0090);
		container.put(new Pair("JAPAN", "INDIA"), 0.67);
		container.put(new Pair("JAPAN", "UK"), 0.0065);
		container.put(new Pair("UK", "INDIA"), 103.27);
		container.put(new Pair("UK", "AMERICA"), 1.39);
		container.put(new Pair("UK", "JAPAN"), 154.19);
	}

	public Double value(String Countryfrom, String countryto) {
		Pair<String, String> p = new Pair(Countryfrom, countryto);
		return container.get(p);
	}
}
