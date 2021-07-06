package com.constant;

public class Constants {
	public static final String GET_ALL_BRANCH = "select * from BranchDetails";
	public static final String GET_ALL_TABLE= "select * from tableReservation";
	public static final String RESERVE_TABLE= "select * from tableReservation where status = 'vacant'";
	public static final String INSERT_CUSTOMER = " insert into Customer (customerName, customerNumber, customerAddress,email,password)  values (?,?,?,?,?)";
	

}
