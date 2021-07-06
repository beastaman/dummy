package com.example.demo;

public class Demo1 {
	private String name;
	private String address;
	public Demo1() {
		
	}
	public Demo1(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Demo1 [name=" + name + ", address=" + address + "]";
	}
	
	
}
