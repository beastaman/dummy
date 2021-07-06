package com.sapient.to;

public class StudentMarks {

	private String id;
	private String name;
	private int testno;
	private int totalMarks;
	
	public StudentMarks(String id, String name, int testno, int totalMarks) {
		super();
		this.id = id;
		this.name = name;
		this.testno = testno;
		this.totalMarks = totalMarks;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTestno() {
		return testno;
	}

	public void setTestno(int testno) {
		this.testno = testno;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	@Override
	public String toString() {
		return "StudentMarks [id=" + id + ", name=" + name + ", testno=" + testno + ", totalMarks=" + totalMarks + "]";
	}
	
}
