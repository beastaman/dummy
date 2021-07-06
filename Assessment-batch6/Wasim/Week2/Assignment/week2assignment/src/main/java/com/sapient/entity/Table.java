package com.sapient.entity;

public class Table {

	private String tid;
	private int price;
	private String status;
	private String bid;

	public Table(String tid, int price, String status, String bid) {
		super();
		this.tid = tid;
		this.price = price;
		this.status = status;
		this.bid = bid;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getStatus() {
		return status.equals("1") ? "Available" : "Not available";
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}


	@Override
	public String toString() {
		return "Table [tid=" + tid + ", price=" + price + ", status=" + status + ", bid=" + bid + "]";
	}

}
