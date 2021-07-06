package com.to;

public class StudentJoinMark {

	private String id;
	private String fname;
	private String lname;
	private String dob;
	private String area;
	private String mobileno;
	private int testno;
	private int m1;
	private int m2;
	private int m3;

	public StudentJoinMark() {
		super();
	}

	public StudentJoinMark(String id, String fname, String lname, String dob, String area, String mobileno, int testno,
			int m1, int m2, int m3) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.area = area;
		this.mobileno = mobileno;
		this.testno = testno;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public int getTestno() {
		return testno;
	}

	public void setTestno(int testno) {
		this.testno = testno;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	@Override
	public String toString() {
		return "StudentJoinMark [id=" + id + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", area=" + area
				+ ", mobileno=" + mobileno + ", testno=" + testno + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}
}
