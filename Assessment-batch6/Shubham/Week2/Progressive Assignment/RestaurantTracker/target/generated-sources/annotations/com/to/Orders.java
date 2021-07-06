package com.to;

import java.util.List;

public class Orders {
	private String username;
	private String fname;
	private String lname;
	private String phoneno;
	private List<List<String>> bill;
	private String status;
	public Orders(String username, String fname, String lname, String phoneno, List<List<String>> bill, String status) {
		super();
		this.username = username;
		this.fname = fname;
		this.lname = lname;
		this.phoneno = phoneno;
		this.bill = bill;
		this.status = status;
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public List<List<String>> getBill() {
		return bill;
	}
	public void setBill(List<List<String>> bill) {
		this.bill = bill;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
