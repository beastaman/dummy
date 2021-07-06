package com.to;

public class Students {
	private String id;
	private String fname;
	private String lname;
	private String dob;
	private String area;
	
	
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(String id, String fname, String lname, String dob, String area) {
		super();
		this.id = id;
		this.lname = lname;
		this.fname = fname;
		this.dob = dob;
		this.area = area;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	

}
