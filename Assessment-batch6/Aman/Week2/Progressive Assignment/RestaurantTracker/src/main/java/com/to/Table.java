package com.to;

public class Table {
	private String tablestatus;
	private String tableid;
	private String branchid;
	public Table(String tablestatus, String tableid, String branchid) {
		super();
		this.tablestatus = tablestatus;
		this.tableid = tableid;
		this.branchid = branchid;
	}
	public Table() {
		super();
	}
	public String getTablestatus() {
		return tablestatus;
	}
	public void setTablestatus(String tablestatus) {
		this.tablestatus = tablestatus;
	}
	public String getTableid() {
		return tableid;
	}
	public void setTableid(String tableid) {
		this.tableid = tableid;
	}
	public String getBranchid() {
		return branchid;
	}
	public void setBranchid(String branchid) {
		this.branchid = branchid;
	}
	@Override
	public String toString() {
		return "Table [tablestatus=" + tablestatus + ", tableid=" + tableid + ", branchid=" + branchid + "]";
	}
	
	
}
