package com.example.demo;

import org.springframework.stereotype.Component;

//Instead of we creating a bean it will
//automatically create a object of this clas
//and it will add it to the beans
public class Demo3 {

	private String name;
	private int age;
	public Demo3() {
		
	}
	public Demo3(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	@Override
	public String toString() {
		return "Demo3 [name=" + name + ", age=" + age + "]";
	}
	

}
