package com.sapient;

public class FigureToWords {
	
	public static String digits1to19(int n)
	{
		String s="";
		switch(n)
		{
			case 1:s=s+"one ";
			break;
			case 2:s=s+"two ";
			break;
			case 3:s=s+"three ";
			break;
			case 4:s=s+"four ";
			break;
			case 5:s=s+"five ";
			break;
			case 6:s=s+"six ";
			break;
			case 7:s=s+"seven ";
			break;
			case 8:s=s+"eight ";
			break;
			case 9:s=s+"nine ";
			break;
			case 10:s=s+"ten ";
			break;
			case 11:s=s+"eleven ";
			break;
			case 12:s=s+"twelve ";
			break;
			case 13:s=s+"thirteen ";
			break;
			case 14:s=s+"fourteen ";
			break;
			case 15:s=s+"fifteen ";
			break;
			case 16:s=s+"sixteen ";
			break;
			case 17:s=s+"seventeen ";
			break;
			case 18:s=s+"eighteen ";
			break;
			case 19:s=s+"nineteen ";
			break;
			
			
		}
		return s;
		
	}
	
	public static String digits20to99(int n)
	{
		String s="";
		int th=n/10;
		int unit=n%10;
		if(th<2)
		{
			s=s+digits1to19(n);
			return s;
		}
		switch(th)
		{
			case 2:s=s+"twenty ";
			break;
			case 3:s=s+"thirty ";
			break;
			case 4:s=s+"forty ";
			break;
			case 5:s=s+"fifty ";
			break;
			case 6:s=s+"sixty ";
			break;
			case 7:s=s+"seventy ";
			break;
			case 8:s=s+"eightty ";
			break;
			case 9:s=s+"ninety ";
			break;
		}
		s=s+digits1to19(unit);
		return s;
		
	}
	public static String digits1to99(int n)
	{
		String s="";
		if(n<20 && n>=10)
		{
			s=s+digits1to19(n);
		}
		else
		{
			s=s+digits20to99(n);
		}
		return s;
	}
	public static String digits1to999(int n)
	{
		String s="";
		int h=n/100;
		int rem=n%100;
		if(h!=0)
			s=s+digits1to19(h)+"hundred "+digits1to99(rem);
		else
			s=s+digits1to99(rem);
		return s;
	}
	public static String digits1to99999(int n)
	{
		String s="";
		int h=n/1000;
		int rem=n%1000;
		if(h!=0)
			s=s+digits1to99(h)+"thousand "+digits1to999(rem);
		else
			s=s+digits1to999(rem);
		return s;
	}
	public static String digits1to9999999(int n)
	{
		String s="";
		int h=n/100000;
		int rem=n%100000;
		if(h!=0)
			s=s+digits1to99(h)+"lakh "+digits1to99999(rem);
		else
			s=s+digits1to99999(rem);
		return s;
	}
	
	public static String figureToWords(int num)
	{
		if(num==0)
			return "Zero";
		else
		{
			return digits1to9999999(num);
		}
	}
	public static void main(String[] args) {
		int  n1=Read.sc.nextInt();
		System.out.println(figureToWords(n1)+"only");
	}
}
