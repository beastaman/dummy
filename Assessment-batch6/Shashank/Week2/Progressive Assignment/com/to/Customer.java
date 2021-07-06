package com.to;

public class Customer {
	private String cid , fname , lname , phone , area;

	public Customer(String cid, String fname, String lname, String phone, String area) {
		super();
		this.cid = cid;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.area = area;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
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
