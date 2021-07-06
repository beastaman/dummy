package com.to;

public class Order {
	private String custid;
	private String branchid;
	private String tableid;
	private String orderid;
	public Order(String custid, String branchid, String tableid, String orderid) {
		super();
		this.custid = custid;
		this.branchid = branchid;
		this.tableid = tableid;
		this.orderid = orderid;
	}
	public Order() {
		super();
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
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
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	@Override
	public String toString() {
		return "Order [custid=" + custid + ", branchid=" + branchid + ", tableid=" + tableid + ", orderid=" + orderid
				+ "]";
	}
	
}
