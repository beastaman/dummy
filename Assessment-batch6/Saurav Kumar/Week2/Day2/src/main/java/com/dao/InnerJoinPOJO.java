package com.dao;

public class InnerJoinPOJO {
	private String id;
	private String fname;
	private String testno;
	private String totalmarks;
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
	public String getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(String totalmarks) {
		this.totalmarks = totalmarks;
	}
	public InnerJoinPOJO(String id, String fname, String testno, String totalmarks) {
		super();
		this.id = id;
		this.fname = fname;
		this.testno = testno;
		this.totalmarks = totalmarks;
	}
	public InnerJoinPOJO() {
		super();
	}
	@Override
	public String toString() {
		return "InnerJoinPOJO [id=" + id + ", fname=" + fname + ", testno=" + testno + ", totalmarks=" + totalmarks
				+ "]";
	}
	
	
}
