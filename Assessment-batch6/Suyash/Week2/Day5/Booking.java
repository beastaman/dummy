package com.to;

public class Booking {
	private String orderid;
	private String branchid;
	private String tableid;
	private String time;
	
	public Booking(String orderid, String branchid, String tableid, String time) {
		super();
		this.orderid = orderid;
		this.branchid = branchid;
		this.tableid = tableid;
		this.time = time;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getBranchid() {
		return branchid;
	}
	public void setBranchid(String branchid) {
		this.branchid = branchid;
	}
	public String getTableid() {
		return tableid;
	}
	public void setTableid(String tableid) {
		this.tableid = tableid;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
