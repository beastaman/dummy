package com.to;

public class Branch {
	private String branchid;
	private String tables;
	public Branch(){
		
	}
	
	public Branch(String branchid, String tables) {
		super();
		this.branchid = branchid;
		this.tables = tables;
	}

	public String getBranchid() {
		return branchid;
	}
	public void setBranchid(String branchid) {
		this.branchid = branchid;
	}
	public String getTables() {
		return tables;
	}
	public void setTables(String tables) {
		this.tables = tables;
	}
	

}
