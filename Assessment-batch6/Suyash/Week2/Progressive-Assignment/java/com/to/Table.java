package com.to;

public class Table {
	public String tableid;
	public String branchid;
	public Table(){
		
	}
	
	public Table(String tableid, String branchid) {
		super();
		this.tableid = tableid;
		this.branchid = branchid;
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
	
	

	
	
}
