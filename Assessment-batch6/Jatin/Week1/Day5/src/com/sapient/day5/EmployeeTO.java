package com.sapient.day5;

public class EmployeeTO {
	private String fname;
	private int age;
	private int salary;

	public EmployeeTO() {
		super();
	}

	public EmployeeTO(String fname, int age, int salary) {
		super();
		this.fname = fname;
		this.age = age;
		this.salary = salary;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeTO [fname=" + fname + ", age=" + age + ", salary=" + salary + "]";
	}

}
