package com.sapient;

public class IntToWords {
	 private final String ones[] = { "", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", 
			 "nine ", "ten ", "eleven ", "twelve ", "thirteen ", "fourteen ", "fifteen ","sixteen ", 
			 "seventeen ", "eighteen ", "nineteen " };
	 private final String tens[] = { "", "", "twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ", "eighty ", 
	 		 "ninety " };
	 private final String svalues[] = {" Crore "," Lakhs "," Thousand "," Hundred "," Only"};
	 private final long nvalues[]= {10000000l,100000l,1000l,100l,1l};
	private long num;
	private String numInWords="";
	public IntToWords(long num2)
	{
		this.num=num2;
	}
	public void covertIntToWords()
	{
		long num1=num;
        String ans="";
        for(int i=0;i<nvalues.length;++i)
        {
        	int n=(int)(num1/nvalues[i]);
        	num1%=nvalues[i];
        	if(n>0)
        	{
        		if(n<=19)
        			ans+=ones[n]+svalues[i];
        		else
        			ans+=tens[n/10]+ones[n%10]+svalues[i];
        	}
        }
        numInWords=ans;
	}
	public void displayInWords()
	{
		System.out.println("Number "+ num + " in words is : "+numInWords);
	}
}
