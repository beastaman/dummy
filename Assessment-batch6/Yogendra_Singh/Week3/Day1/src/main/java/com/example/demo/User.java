package com.example.demo;

public class User {
	private int id;
	private String name;
	private String address;
	
	
	
	/**
	 * @param id
	 * @param name
	 * @param address
	 */
	public User() {
		
	}
	public User(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public void display() {
		
	}

}
