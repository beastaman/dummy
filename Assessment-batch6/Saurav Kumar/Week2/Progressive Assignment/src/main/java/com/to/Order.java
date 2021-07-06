package com.to;

public class Order {
	private String orderid;
	private String status;
	private int price;
	
	public Order() {
		super();
	}
	public Order(String orderid, String status, int price) {
		super();
		this.orderid = orderid;
		this.status = status;
		this.price = price;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
