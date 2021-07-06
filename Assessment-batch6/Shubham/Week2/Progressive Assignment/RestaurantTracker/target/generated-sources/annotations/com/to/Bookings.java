package com.to;

public class Bookings {
	private String username;
	private String branch;
	private String date;
	private String time;
	private String tableId;
	private String guests;
	
	public Bookings(String username, String branch, String date, String time, String tableId, String guests) {
		super();
		this.username = username;
		this.branch = branch;
		this.date = date;
		this.time = time;
		this.tableId = tableId;
		this.guests = guests;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTableId() {
		return tableId;
	}
	public void setTableId(String tableId) {
		this.tableId = tableId;
	}
	public String getGuests() {
		return guests;
	}
	public void setGuests(String guests) {
		this.guests = guests;
	}
}
