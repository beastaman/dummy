package com.package1;

public class EmployeeTO {
	private int age;
	private float salary;
	private String fname;
	private String lname;
	EmployeeTO(){
		
	}
	public EmployeeTO(int age, float salary, String fname, String lname) {
		super();
		this.age = age;
		this.salary = salary;
		this.fname = fname;
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "EmployeeTO [age=" + age + ", salary=" + salary + ", fname=" + fname + ", lname=" + lname + "]";
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

}
