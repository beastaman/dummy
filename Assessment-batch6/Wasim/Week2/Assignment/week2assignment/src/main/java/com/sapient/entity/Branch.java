package com.sapient.entity;

public class Branch {

	private String bId;
	private String address;
	private String phoneNo;
	private String name;

	public Branch() {

	}

	public Branch(String bId,  String name, String address, String phoneNo) {
		super();
		this.bId = bId;
		this.address = address;
		this.phoneNo = phoneNo;
		this.name = name;
	}

	public String getbId() {
		return bId;
	}

	public void setbId(String bId) {
		this.bId = bId;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Branch [bId=" + bId + ", address=" + address + ", phoneNo=" + phoneNo + ", name=" + name + "]";
	}

	

}
