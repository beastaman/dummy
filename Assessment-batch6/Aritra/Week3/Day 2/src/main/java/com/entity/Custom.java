package com.entity;

public class Custom {
	
	String id;
	String fname;
	String testno;
	int total;
	
	public Custom(String id, String fname, String testno, int total) {
		super();
		this.id = id;
		this.fname = fname;
		this.testno = testno;
		this.total = total;
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
	public String getTestno() {
		return testno;
	}
	public void setTestno(String testno) {
		this.testno = testno;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Custom [id=" + id + ", fname=" + fname + ", testno=" + testno + ", total=" + total + "]";
	}
	
	

}
