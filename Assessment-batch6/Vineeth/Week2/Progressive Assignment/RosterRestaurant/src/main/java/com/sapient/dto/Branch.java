package com.sapient.dto;

import java.sql.Timestamp;

public class Branch {
	
	private int id;
	private String name;
	private Timestamp open;
	private Timestamp close;
	private String address;

	public Branch() {
		super();
	}

	public Branch(int id, String name, Timestamp open, Timestamp close, String address) {
		super();
		this.id = id;
		this.name = name;
		this.open = open;
		this.close = close;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getOpen() {
		return open;
	}

	public void setOpen(Timestamp open) {
		this.open = open;
	}

	public Timestamp getClose() {
		return close;
	}

	public void setClose(Timestamp close) {
		this.close = close;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
