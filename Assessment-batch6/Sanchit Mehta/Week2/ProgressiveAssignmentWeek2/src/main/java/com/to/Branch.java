package com.to;

public class Branch {

	protected String bid;
	protected String city;
	protected int tableCount;
	protected int availableTables;
	public Branch(String bid, String city, int tableCount, int availableTables) {
		super();
		this.bid = bid;
		this.city = city;
		this.tableCount = tableCount;
		this.availableTables = availableTables;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getTableCount() {
		return tableCount;
	}
	public void setTableCount(int tableCount) {
		this.tableCount = tableCount;
	}
	public int getAvailableTables() {
		return availableTables;
	}
	public void setAvailableTables(int availableTables) {
		this.availableTables = availableTables;
	}
	@Override
	public String toString() {
		return "Branch [bid=" + bid + ", city=" + city + ", tableCount=" + tableCount + ", availableTables="
				+ availableTables + "]";
	}
	
	
	
}
