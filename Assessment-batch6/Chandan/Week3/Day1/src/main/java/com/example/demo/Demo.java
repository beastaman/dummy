package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Demo {

	private String name;
	private String address;
	
	
	
	public Demo() {
		super();
	}

	public Demo(String name, String address) {
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
		return "Demo [name=" + name + ", address=" + address + "]";
	}

	

}
