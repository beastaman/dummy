package com.to;

public class User {
	private String userid;
	private String password;
	
	public User() {
		
	}
	public User(String userid, String password, String status) {
		super();
		this.userid = userid;
		this.password = password;
		this.status = status;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
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
	private String status;
	
	
	
}
