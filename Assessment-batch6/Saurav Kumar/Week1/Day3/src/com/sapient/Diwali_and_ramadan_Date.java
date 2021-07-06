package com.sapient;

import java.util.Calendar;

public class Diwali_and_ramadan_Date {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
        cal.set(2021, 04, 13);
        int cnt=1;
        for(int i=0; i<10; i++) {
            if(cnt==3) {
                cal.add(Calendar.DATE, (int)(13*29.5));
                cnt = 1;
            } else {
                cal.add(Calendar.DATE, (int)(12*29.5));
                cnt++;
            }

            System.out.println(cal.get(Calendar.YEAR) + "-"+cal.get(Calendar.MONTH)+"-"+cal.get(Calendar.DATE));
        }
	}
}
