package com.constant;

public class Constant {
	public static final String GET_ALL_CUSTOMERS= "SELECT customerId , email, password,firstName,"
			+ "lastName,phoneNo , address from customers";
	public static final String GET_CUSTOMER_BY_EMAIL= "SELECT customerId , email, password,firstName,"
			+ "lastName,phoneNo , address from customers where email = ? ";
	public static final String GET_ALL_BRANCHES= "SELECT branchId,branchCity,branchContact,branchAddress from branches"
			+ " order by branchCity";
	public static final String GET_ALL_STUDENTS= "select id ,fname,lname,dob,area from students";
	public static final String INSERT_STUDENT_DATA= "INSERT into students values (?,?,?,?,?)";
}
