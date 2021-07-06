package com.sapient;

public class numberToFigure {
	
	private int num;
	
	private final String[] ONES_PLACE = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	private final String[] TENS_PLACE = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	private final String[] TENS_PLACE_SPCL = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	private final String[] PLACE = {"thousand", "lakh", "crore"};
	
	public numberToFigure(int num) {
		this.num = num;
	}
	
	private String convertTwoDigit(int number) {
		if(number==0)
			return "";
		else if(number>=1 && number<=9)
			return ONES_PLACE[number-1];
		else if(number>=11 && number<=19)
			return TENS_PLACE_SPCL[number-11];
		else {
			if(number%10==0)
				return TENS_PLACE[number/10 - 1];
			
			return TENS_PLACE[number/10 - 1] + " " + ONES_PLACE[number%10 - 1];
		}
	}
	
	private String convertThreeDigit(int number) {
		String twodig = convertTwoDigit(number%100);
		if(twodig!="")
			twodig = "and " + twodig;
		
		if(number/100 > 0) {
			return ONES_PLACE[number/100 - 1] + " hundred " + twodig;
		}
		
		return twodig;
		
	}
	
	public String convert() {
		
		String result = "";
		
		if(this.num == 0) {
			result = "zero";
		}
		else if (this.num>=1 && this.num<=9) {
			result = ONES_PLACE[this.num-1];
		}
		else if(this.num>=10 && this.num<=99) {
			result = convertTwoDigit(this.num);
		}
		else if(this.num>=100 && this.num<=999) {
			result = convertThreeDigit(this.num);
		}
		else {
			result = convertThreeDigit(this.num%1000);
			
			int i = this.num/1000;
			int p = 0;
			while(i>0 && p<3) {
				int k = i%100;
				if(k!=0) {
					result = convertTwoDigit(k) + " " + PLACE[p] + " " + result;
				}
				i = i/100;
				p += 1;
			}
			
			if(i>0 && p>=3)
				result = "Too Big Number";
		}
		
		return result;
	}

}
