package com.to;

public class StudentAndCities {
	private String id;
	private String fname;
	private String lname;
	private String db;
	private String area;
	private String cid;
	private String cname;
	private String sid;

	public StudentAndCities() {
		super();
	}

	public StudentAndCities(String id, String fname, String lname, String db, String area, String cid, String cname,
			String sid) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.db = db;
		this.area = area;
		this.cid = cid;
		this.cname = cname;
		this.sid = sid;
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

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return "StudentAndCities [id=" + id + ", fname=" + fname + ", lname=" + lname + ", db=" + db + ", area=" + area
				+ ", cid=" + cid + ", cname=" + cname + ", sid=" + sid + "]";
	}

}
