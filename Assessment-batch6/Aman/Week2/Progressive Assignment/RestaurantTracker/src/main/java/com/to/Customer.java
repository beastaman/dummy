package com.to;

public class Customer {
	private String fname;
	private String lname;
	private String contact;
	private String custid;
	private String email;
	private String password;
	public Customer(String fname, String lname, String contact, String custid, String email, String password) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.contact = contact;
		this.custid = custid;
		this.email = email;
		this.password = password;
	}
	public Customer() {
		super();
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [fname=" + fname + ", lname=" + lname + ", contact=" + contact + ", custid=" + custid
				+ ", email=" + email + ", password=" + password + "]";
	}
	
}
