package com.entity;

public class User {
	private int userid;
	private String username;
	private String password;
	private String phoneNo;

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", phoneNo=" + phoneNo
				+ "]";
	}

	public User() {
	}

	public User(int userid, String username, String password, String phoneNo) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.phoneNo = phoneNo;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
