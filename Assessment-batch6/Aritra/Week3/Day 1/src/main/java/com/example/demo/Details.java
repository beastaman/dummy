package com.example.demo;

import org.springframework.stereotype.Component;

//@Component("details")
public class Details {
	
	public Details(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Details() {
		super();
	}

	private String name;
	private int age;

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


	@Override
	public String toString() {
		return "Demo3 [name=" + name + ", age=" + age + "]";
	}

}
