package com.entity;

public class Table {
	private int tableid;
	private int isAvailable;
	private int branchid;
	private String starttime;
	private String endtime;

	@Override
	public String toString() {
		return "Table [tableid=" + tableid + ", isAvailable=" + isAvailable + ", branchid=" + branchid + ", starttime="
				+ starttime + ", endtime=" + endtime + "]";
	}

	public Table() {
	}

	public Table(int tableid, int isAvailable, int branchid, String starttime, String endtime) {
		super();
		this.tableid = tableid;
		this.isAvailable = isAvailable;
		this.branchid = branchid;
		this.starttime = starttime;
		this.endtime = endtime;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public int getTableid() {
		return tableid;
	}

	public void setTableid(int tableid) {
		this.tableid = tableid;
	}

	public int getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(int isAvailable) {
		this.isAvailable = isAvailable;
	}

	public int getBranchid() {
		return branchid;
	}

	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}
}
