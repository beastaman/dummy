package com.to;

public class Booking {
	private Integer orderid;
	private String branchid;
	private String tableid;
	public String userid;
	private String time;
	
	public Booking(Integer orderid, String branchid, String tableid, String userid, String time) {
		super();
		this.orderid = orderid;
		this.branchid = branchid;
		this.tableid = tableid;
		this.userid = userid;
		this.time = time;
	}
	public Integer getOrderid() {
		return orderid;
	}
	public void setOrderid(Integer orderid) {
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
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
	
}
