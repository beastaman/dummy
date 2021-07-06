package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Demo1 {

	private String name;
	private String address;

	public Demo1() {
		super();
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

	public void display() {
		System.out.println("Name : " + name + " Address : " + address);
	}

	@Override
	public String toString() {
		return "Demo1 [name=" + name + ", address=" + address + "]";
	}

}
