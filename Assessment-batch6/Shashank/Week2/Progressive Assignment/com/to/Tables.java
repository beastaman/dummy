package com.to;

public class Tables {
	private String tid , bid ,booked , status;

	public Tables(String tid, String bid, String booked, String status) {
		super();
		this.tid = tid;
		this.bid = bid;
		this.booked = booked;
		this.status = status;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
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
