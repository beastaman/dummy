package com.to;

public class User {
	private String username;
	private String password;
	private String fname;
	private String lname;
	private String phoneno;
	
	public User(String username, String password, String fname, String lname, String phoneno) {
		super();
		this.username = username;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.phoneno = phoneno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", fname=" + fname + ", lname=" + lname
				+ ", phoneno=" + phoneno + "]";
	}
}
