package com.sapient.day4;

public class EmployeeTo {
	
	private int age;
	private String fname;
	private String lname;
	private int Salary;
	
	
	public EmployeeTo() {
		super();
	}
	
	public EmployeeTo(int age, String fname, String lname, int salary) {
		super();
		this.age = age;
		this.fname = fname;
		this.lname = lname;
		Salary = salary;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeTo [age=" + age + ", fname=" + fname + ", lname=" + lname + ", Salary=" + Salary + ", getAge()="
				+ getAge() + ", getFname()=" + getFname() + ", getLname()=" + getLname() + ", getSalary()="
				+ getSalary() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
