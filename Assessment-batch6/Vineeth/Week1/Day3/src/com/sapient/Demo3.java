package com.sapient;

import java.util.Calendar;

public class Demo3 {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("Ramzan Dates for Next 10 years");
		calendar.set(2021, 3, 13);
		for (int i=0;i<10;i++) {
			calendar.add(Calendar.DATE, 354);
			calendar.add(Calendar.HOUR, 8);
			calendar.add(Calendar.MINUTE, 48);
			calendar.add(Calendar.SECOND, 34);
			System.out.printf("%02d-%02d-%04d\n", calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR));
		}
	}
}
