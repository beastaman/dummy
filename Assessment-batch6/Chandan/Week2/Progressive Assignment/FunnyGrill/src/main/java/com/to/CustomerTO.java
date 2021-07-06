package com.to;

public class CustomerTO {

	private int id;
	private String email;
	private String password;
	private String fname;
	private String lname;
	private String phNo;
	private int status;

	public CustomerTO() {
		super();
	}

	public CustomerTO(int id, String email, String password, String fname, String lname, String phNo, int status) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.phNo = phNo;
		this.status = status;
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

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String ph_no) {
		this.phNo = ph_no;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
