package com.example.demo;

public class Demo1 {
	private String name;
	private int age;
	@Override
	public String toString() {
		return "Demo1 [name=" + name + ", age=" + age + "]";
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
	public Demo1() {
		
	}
	public Demo1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}
