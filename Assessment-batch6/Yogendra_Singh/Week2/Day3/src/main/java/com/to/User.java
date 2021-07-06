package com.to;

public class User {
	private String  userid;
	private String  userpassword;
	private String  status;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public User(String userid, String userpassword, String status) {
		super();
		this.userid = userid;
		this.userpassword = userpassword;
		this.status = status;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", userpassword=" + userpassword + ", status=" + status + "]";
	}
	
}

