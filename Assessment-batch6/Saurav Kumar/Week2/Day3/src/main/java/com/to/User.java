package com.to;

public class User {
	private String userID;
	private String password;
	private String status;
	public User(String userID, String password, String status) {
		super();
		this.userID = userID;
		this.password = password;
		this.status = status;
	}
	public User() {
		super();
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
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
