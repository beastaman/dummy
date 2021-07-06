package com.to;

public class Service {
	private String sid , bid ,booked , status;

	public Service(String sid, String bid, String booked, String status) {
		super();
		this.sid = sid;
		this.bid = bid;
		this.booked = booked;
		this.status = status;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getBooked() {
		return booked;
	}

	public void setBooked(String booked) {
		this.booked = booked;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

}
