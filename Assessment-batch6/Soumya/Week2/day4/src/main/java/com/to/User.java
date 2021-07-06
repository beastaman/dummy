package com.to;

public class User {

	private String userId;
	private String userpassword;
	private String status;

	public User(String userId, String userpassword, String status) {
		super();
		this.userId = userId;
		this.userpassword = userpassword;
		this.status = status;
	}

	public User() {
		super();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return userpassword;
	}

	public void setPassword(String password) {
		this.userpassword = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
