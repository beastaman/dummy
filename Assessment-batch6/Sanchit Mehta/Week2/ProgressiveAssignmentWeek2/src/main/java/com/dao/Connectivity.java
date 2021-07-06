package com.dao;

import java.sql.*;

public class Connectivity {

	/*
	 * com.mysql.cj.jdbc.Driver "jdbc:mysql://localhost:3306/alphschool", "root",
	 * "admin"
	 * 
	 */
	

	public static Connection connection = null;

	public Connectivity() {

	}

	public static Connection getConnection() throws Exception {
		
		if(connection == null) {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
//			String url="jdbc:mysql://127.0.0.1:3306/employee_management_system";
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/restaurant" , "root" , "root");
			
		}
		
		return connection;
	}

}

















