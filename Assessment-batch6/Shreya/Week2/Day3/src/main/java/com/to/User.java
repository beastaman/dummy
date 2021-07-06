package com.to;

public class User {
	private String userId;
	private String password;
	private String status;
	public User() {
		super();
	}
	public User(String userId, String password, String status) {
		super();
		this.userId = userId;
		this.password = password;
		this.status = status;
	}
	public User(String parameter, String parameter2, Object status2) {
		// TODO Auto-generated constructor stub
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
