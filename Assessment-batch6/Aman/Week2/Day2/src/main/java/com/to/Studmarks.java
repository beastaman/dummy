package com.to;

public class Studmarks {
	private String id;
	private String fname;
	private String lname;
	private String testno ;
	private String m1;
	private String m2;
	private String m3;
	public Studmarks(String id, String fname, String lname, String testno, String m1, String m2, String m3) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.testno = testno;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	public Studmarks() {
		super();
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
	public String getTestno() {
		return testno;
	}
	public void setTestno(String testno) {
		this.testno = testno;
	}
	public String getM1() {
		return m1;
	}
	public void setM1(String m1) {
		this.m1 = m1;
	}
	public String getM2() {
		return m2;
	}
	public void setM2(String m2) {
		this.m2 = m2;
	}
	public String getM3() {
		return m3;
	}
	public void setM3(String m3) {
		this.m3 = m3;
	}
	@Override
	public String toString() {
		return "Studmarks [id=" + id + ", fname=" + fname + ", lname=" + lname + ", testno=" + testno + ", m1=" + m1
				+ ", m2=" + m2 + ", m3=" + m3 + "]";
	}
	
}
