package com.sapient;

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class dateOfFestivals {
	
	private Calendar calendar;
	private Date date;
	private ArrayList<String> DiwaliDates;
	private ArrayList<String> RamzanDates;
	
	dateOfFestivals(){
		this.calendar=Calendar.getInstance();
		this.date=calendar.getTime();
	}
	public void calculate() {
		
	}
}
