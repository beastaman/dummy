package com.entity;

public class Branches {
	private int branchid;
	private String branchName;
	private int capacity;

	public Branches() {
	}

	public Branches(int branchid, String branchName, int capacity) {
		super();
		this.branchid = branchid;
		this.branchName = branchName;
		this.capacity = capacity;
	}

	public int getBranchid() {
		return branchid;
	}

	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
