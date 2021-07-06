package com.to;

public class Student {

	private String id;
	private String Fname;
	private String Lname;
	private String dob;
	private String phoneNo;
	private String area;
	
	
	public Student() {
		super();
	}

	public Student(String id, String fname, String lname, String dob, String phoneNo, String area) {
		super();
		this.id = id;
		Fname = fname;
		Lname = lname;
		this.dob = dob;
		this.phoneNo = phoneNo;
		this.area = area;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Fname=" + Fname + ", Lname=" + Lname + ", dob=" + dob + ", phoneNo=" + phoneNo
				+ ", area=" + area + "]";
	}
	
	
}
