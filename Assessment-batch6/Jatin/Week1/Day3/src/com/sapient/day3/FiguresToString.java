package com.sapient.day3;

public class FiguresToString {
	private final String[] oneDigit = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };
	private final String[] twoDigits = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };
	private final String[] sValue = { "Crore", "Lakhs", "Thousand", "Hundred", "Only" };
	private final Long[] nValue = { 10000000l, 100000l, 1000l, 100l, 1l };

	public String getFigures(Long n) {
		String word = "";
		for (int i = 0; i < nValue.length; i++) {
			int n1 = (int) (n / nValue[i]);
			n = n % nValue[i];
			if (n1 > 0) {
				if (n1 <= 19)
					word = word + oneDigit[n1] + sValue[i];
				else {
					word = word + twoDigits[n1 / 10] + oneDigit[n1 % 10] + sValue[i];
				}
			}
		}
		return word;
	}
}

