package com.example.demo;

//@Component("details")
public class Details {

	private String name;
	private int age;

	public Details() {
		super();
	}

	public Details(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Details [name=" + name + ", age=" + age + "]";
	}

}
