package com.to;

public class Branch {
	private String branch_id;
	private String name;
	private String email;
	private String phone;
	private String address;

	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Branch(String branch_id, String name, String email, String phone, String address) {
		super();
		this.branch_id = branch_id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	public String getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
