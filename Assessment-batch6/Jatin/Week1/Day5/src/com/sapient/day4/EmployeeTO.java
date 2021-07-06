package com.sapient.day4;

public class EmployeeTO {
	private String fname;
	private int age;
	private String lname;
	private int salary;

	public EmployeeTO() {
		super();
	}

	public EmployeeTO(String fname, int age, String lname, int salary) {
		super();
		this.fname = fname;
		this.age = age;
		this.lname = lname;
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

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeTO [fname=" + fname + ", age=" + age + ", lname=" + lname + ", salary=" + salary + "]";
	}

}
