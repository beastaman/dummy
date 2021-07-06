package com.to;

public class Delivery {

	private String orderid;
	private String userid;
	private String bid;
	private String bookingtime;
	
	
	
	public Delivery() {
		super();
	}
	
	public Delivery(String orderid, String userid, String bid, String bookingtime) {
		super();
		this.orderid = orderid;
		this.userid = userid;
		this.bid = bid;
		this.bookingtime = bookingtime;
	}
	
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
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
	public String getBookingtime() {
		return bookingtime;
	}
	public void setBookingtime(String bookingtime) {
		this.bookingtime = bookingtime;
	}
	
	
	
}
