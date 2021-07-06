package com.to;

public class StaffTO {

	private int id;
	private String username;
	private String password;
	private int branchId;

	public StaffTO() {
		super();
	}

	public StaffTO(int id, String username, String password, int branchId) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.branchId = branchId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

}
