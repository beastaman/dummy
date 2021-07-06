package com.sapient.dto;

public class User {

	private int id;
	private String email;
	private String password;
	private String fname;
	private String lname;
	private String phone;

	public User() {
		super();
	}

	public User(int id, String email, String password, String fname, String lname, String phone) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
}
