package com.to;

public class Branch {
	private String location;
	private String contact;
	private String branchid;
	public Branch(String location, String contact, String branchid) {
		super();
		this.location = location;
		this.contact = contact;
		this.branchid = branchid;
	}
	public Branch() {
		super();
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getBranchid() {
		return branchid;
	}
	public void setBranchid(String branchid) {
		this.branchid = branchid;
	}
	@Override
	public String toString() {
		return "Branch [location=" + location + ", contact=" + contact + ", branchid=" + branchid + "]";
	}
	
}
