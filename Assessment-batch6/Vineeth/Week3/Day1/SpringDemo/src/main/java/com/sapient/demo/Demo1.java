package com.sapient.demo;

public class Demo1 {

	private String name;

	public Demo1() {
		super();
	}
	
	public Demo1(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("Hello, " + name + "!");
	}

}
