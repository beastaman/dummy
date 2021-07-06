package com.to;

public class Parcel {
	private String custid;
	private String branchid;
	private String orderid;
	public Parcel(String custid, String branchid, String orderid) {
		super();
		this.custid = custid;
		this.branchid = branchid;
		this.orderid = orderid;
	}
	public Parcel() {
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
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	@Override
	public String toString() {
		return "Parcel [custid=" + custid + ", branchid=" + branchid + ", orderid=" + orderid + "]";
	}
	
}
