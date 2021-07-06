package com.sapient.entity;

public class Branch {
	private String branchId;
	private String name;
	private String address;
	private String phoneNo;

	public Branch(String branchId, String name, String address, String phoneNo) {
		super();
		this.branchId = branchId;
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
	}

	public Branch() {
		super();
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
}
