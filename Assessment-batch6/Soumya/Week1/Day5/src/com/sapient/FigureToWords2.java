package com.sapient;

public class FigureToWords2 {

	private String[] ones = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen",
			"Twenty" };
	private String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
	private String[] sValue = { "Crore", "Lakhs", "Thousand", "Hundred", "Only" };
	private long[] nValue = { 10000000l, 100000l, 1000l, 100l, 1l };

	String word = "";

	public String getFigures(Long n) {
		for (int i = 0; i < nValue.length; ++i) {
			int n1 = (int) (n / nValue[i]);
			n = n % nValue[i];
			if (n1 > 0) {
				if (n1 < 20) {
					word = word + ones[n1] + " " + sValue[i] + " ";
				} else {
					word = word + " " + tens[n1 / 10] + " " + ones[n1 % 10] + " " + sValue[i] + " ";
				}
			}
		}

		return word;
	}

}
