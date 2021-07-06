package com.sapient;

import org.springframework.stereotype.Component;

public class Details {

	private int id;
	private String name;
	private int age;

	public Details() {
		super();
	}

	public Details(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void display() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Details [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
