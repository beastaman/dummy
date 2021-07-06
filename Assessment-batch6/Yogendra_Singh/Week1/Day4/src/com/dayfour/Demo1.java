package com.dayfour;

public class Demo1 {

	public static void main(String[] args) {
		String s=Read.scanner.nextLine();
		String ans="";
		for(int i=0;i<s.length();++i)
		{
			if(s.charAt(i)==' ')
			{
				System.out.println(ans);
				ans="";
			}
			else
				ans+=s.charAt(i);
		}
		System.out.println(ans);
	}

}
