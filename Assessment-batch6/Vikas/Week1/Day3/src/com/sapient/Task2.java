package com.sapient;

public class Task2 {

	private final String[] oneDigit = { "", "one", "two",   "three", "four",
	            "five", "six", "seven", "eight", "nine" };
		
	private final String[] twoDigits = {"", "", "twenty",  "thirty", "forty",
            "fifty", "sixty", "seventy", "eighty", "ninety"};
	
	private final String[] sValue = {"crore", "lakhs", "thousand", "hundred", "only"};
	
	private final Long[] nValue = {10000000l, 1000000l, 1000l, 100l,1l};
	
	String word = "";
	
	public String getWords(Long n) {
		for(int i = 0;i<nValue.length;i++) {
			int n1 = (int)(n/nValue[i]);
			n = n%nValue[i];
			if(n1>0) {
				if(n1<=19) word = word+" "+oneDigit[n1]+" "+sValue[i];
				else {
					word = word +" "+twoDigits[n1/10]+ " "+oneDigit[n1%10]+ " " + sValue[i];
				}
			}
		}
		return word;
	}
}

