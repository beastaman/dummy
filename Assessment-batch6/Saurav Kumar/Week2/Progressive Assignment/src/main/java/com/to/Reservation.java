package com.to;

public class Reservation {

	private String userid;
	private String bid;
	private int tables;
	private String bookingtime;
	
	public Reservation() {
		super();
	}

	public Reservation(String userid, String bid, int tables, String bookingtime) {
		super();
		this.userid = userid;
		this.bid = bid;
		this.tables = tables;
		this.bookingtime = bookingtime;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public int getTables() {
		return tables;
	}

	public void setTables(int tables) {
		this.tables = tables;
	}

	public String getBookingtime() {
		return bookingtime;
	}

	public void setBookingtime(String bookingtime) {
		this.bookingtime = bookingtime;
	}
	
	
	
}
