package com.to;

public class Branch {
	private int branchId;
	private String branchCity;
	private String branchContact;
	private String branchAddress;
	/**
	 * @param branchId
	 * @param branchCity
	 * @param branchContact
	 * @param branchAddress
	 */
	public Branch(int branchId, String branchCity, String branchContact, String branchAddress) {
		super();
		this.branchId = branchId;
		this.branchCity = branchCity;
		this.branchContact = branchContact;
		this.branchAddress = branchAddress;
	}
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchCity() {
		return branchCity;
	}
	public void setBranchCity(String branchCity) {
		this.branchCity = branchCity;
	}
	public String getBranchContact() {
		return branchContact;
	}
	public void setBranchContact(String branchContact) {
		this.branchContact = branchContact;
	}
	public String getBranchAddress() {
		return branchAddress;
	}
	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}
	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", branchCity=" + branchCity + ", branchContact=" + branchContact
				+ ", branchAddress=" + branchAddress + "]";
	}
	

}
