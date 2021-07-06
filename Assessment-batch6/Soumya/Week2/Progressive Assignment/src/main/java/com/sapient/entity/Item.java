package com.sapient.entity;

public class Item {
	private String fid;
	private String name;
	private String price;

	public Item(String fid, String name, String price) {
		super();
		this.fid = fid;
		this.name = name;
		this.price = price;
	}

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Item [fid=" + fid + ", name=" + name + ", price=" + price + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
