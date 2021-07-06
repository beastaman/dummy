package com.sapientweek1;
import java.util.*;
public class CurrencyCountry {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		// write in small letters
		System.out.println("Write country name in small letters");
		System.out.println("Enter source country :");
		String start=scn.next();//source country
		System.out.println("Enter Destination country :");
		String end=scn.next();//destination country
		System.out.println("Enter amount of source country to convert into Destination :");
		int money=scn.nextInt();//enter amount to convert
		converting ct=new converting();
		ct.amount(money,start,end);

	}

}
