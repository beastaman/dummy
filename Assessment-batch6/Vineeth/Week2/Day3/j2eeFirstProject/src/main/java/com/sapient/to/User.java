package com.sapient.to;

public class User {

	private String id;
	private String password;
	private String status;

	public User() {
		super();
	}

	public User(String id, String password, String status) {
		super();
		this.id = id;
		this.password = password;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
