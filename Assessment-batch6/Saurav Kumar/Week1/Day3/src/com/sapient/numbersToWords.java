package com.sapient;

public class numbersToWords {
	private final String[] oneDigit = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] tenDigits = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private final String[] sValue = {"Crore", "Lakhs", "Thousand", "Hundred", "Only"};
    private final Long[] nValue = {10000000l,100000l, 1000l,100l,1l};
		
	public String getWords(long num) {
		String word = "";
		for(int i=0; i<5; i++) {
			int val = (int)(num/nValue[i]);
			if(val>0) {
				if(val <= 19) {
					word = word + " " + oneDigit[val] + " " + sValue[i];
				} else {
					word = word+" " +tenDigits[val/10]+" " +oneDigit[val%10]+" " +sValue[i];
				}
			}
		}
		
		return word;
	}
}
