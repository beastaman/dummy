package com.Constant;

public class Constant {
	public static final String Get_All_Customer= "Select * from Customer;";

	public static final String saveCustomer= "insert into Customer values (?,?,?,?,?)";
	
	
	
	public static final String Get_All_Branch= "Select * from Branch;";

	public static final String saveBranch= "insert into Branch values (?,?,?,?)";
	
	public static final String Get_Available_Tables= "Select * from Branch where status=Not Booked;";
	
	
	public static final String Get_All_Service= "Select * from Service;";

	public static final String saveService= "insert into Service values (?,?,?,?)";
	
	
	
	public static final String Get_All_Tables= "Select * from Tables;";

	public static final String saveTables= "insert into Tables values (?,?,?,?)";

}
