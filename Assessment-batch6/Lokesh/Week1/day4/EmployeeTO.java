package com.week1.day4;

public class EmployeeTO {

	private String firstName;
	private String lastName;
	private int salaly;
	private int age;

	public EmployeeTO() {
		
	}

	public EmployeeTO(String firstName, String lastName, int salaly, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salaly = salaly;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String empFirstName) {
		this.firstName = empFirstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String empLastName) {
		this.lastName = empLastName;
	}

	public int getSalaly() {
		return salaly;
	}

	public void setSalaly(int salaly) {
		this.salaly = salaly;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "EmployeeTO [firstName=" + firstName + ", lastName=" + lastName + ", salaly="
				+ salaly + ", age=" + age + "]";
	}
	
	

}
