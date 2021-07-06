package com.entity;

public class Order {
	private int orderid;
	private String orderType;
	private String orderedStatus;
	private int userid;

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", orderType=" + orderType + ", orderedStatus=" + orderedStatus
				+ ", userid=" + userid + "]";
	}

	public Order() {
	}

	public Order(int orderid, String orderType, String orderedStatus, int userid) {
		super();
		this.orderid = orderid;
		this.orderType = orderType;
		this.orderedStatus = orderedStatus;
		this.userid = userid;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderedStatus() {
		return orderedStatus;
	}

	public void setOrderedStatus(String orderedStatus) {
		this.orderedStatus = orderedStatus;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}
}
