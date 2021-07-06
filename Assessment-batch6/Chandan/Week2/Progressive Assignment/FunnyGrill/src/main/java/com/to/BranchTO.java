package com.to;

public class BranchTO {

	private int id;
	private String area;
	private String city;
	private String state;
	private int tables;
	private String ph_no;

	public BranchTO() {
		super();
	}

	public BranchTO(int id, String area, String city, String state, int tables, String ph_no) {
		super();
		this.id = id;
		this.area = area;
		this.city = city;
		this.state = state;
		this.tables = tables;
		this.ph_no = ph_no;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getTables() {
		return tables;
	}

	public void setTables(int tables) {
		this.tables = tables;
	}

	public String getPh_no() {
		return ph_no;
	}

	public void setPh_no(String ph_no) {
		this.ph_no = ph_no;
	}
	
	public String getAddress() {
		return this.area+","+this.city+","+this.state;
	}

}
