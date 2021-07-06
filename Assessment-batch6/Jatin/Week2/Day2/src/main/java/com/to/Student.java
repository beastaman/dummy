package com.to;

public class Student {
	private String id;
	private String fname;
	private String lname;
	private String db;
	private String area;

	public Student() {
		super();
	}

	public Student(String id, String fname, String lname, String db, String area) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.db = db;
		this.area = area;
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

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", db=" + db + ", area=" + area + "]";
	}

}
