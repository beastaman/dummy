package com.to;

public class User {
	
	private String userid;
	private String fname;
	private String lname;
	private String phone;
	private String password;
	
	public User() {
		super();
	}

	public User(String userid, String fname, String lname, String phone, String password) {
		super();
		this.userid = userid;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.password = password;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", fname=" + fname + ", lname=" + lname + ", phone=" + phone + ", password="
				+ password + "]";
	}
	
	
}
