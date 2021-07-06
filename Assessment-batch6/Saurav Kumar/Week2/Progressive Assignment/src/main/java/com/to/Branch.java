package com.to;

public class Branch {
	
	private String bid;
	private String location;
	private int capacity;
	private int available;
	
	public Branch() {
		super();
	}

	public Branch(String bid, String location, int capacity, int available) {
		super();
		this.bid = bid;
		this.location = location;
		this.capacity = capacity;
		this.available = available;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}
	
	
	
}
