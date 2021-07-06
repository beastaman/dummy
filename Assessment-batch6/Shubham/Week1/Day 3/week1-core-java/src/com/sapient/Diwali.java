package com.sapient;

import java.util.Calendar;

public class Diwali {
	public static void main(String[] args) {
        //Diwali and Ramazan
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021,04,13);
        int flag=1;
        for(int i=0;i<10;i++){
            if(flag==3) {
                calendar.add(Calendar.DATE,(int)(13*29.5));
                flag=1;
            }else{
                calendar.add(Calendar.DATE,(int)(12*29.5));
                flag++;
            }
            System.out.println(calendar.get(Calendar.YEAR)+"-"+calendar.get(Calendar.MONTH)+"-"+calendar.get(Calendar.DATE));
        }
    }
}
