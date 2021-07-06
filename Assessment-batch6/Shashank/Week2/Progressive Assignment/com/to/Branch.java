package com.to;

public class Branch {

	
	private  String bid ,bmanager, phone , area;
	public Branch() {}
	
	public Branch(String bid, String bmanager, String phone, String area) {
		super();
		this.bid = bid;
		this.bmanager = bmanager;
		this.phone = phone;
		this.area = area;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getBmanager() {
		return bmanager;
	}

	public void setBmanager(String bmanager) {
		this.bmanager = bmanager;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	
	
}
