package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectivity {

	/*
	 * jdbc:mysql://localhost:3306/alphschool", "root", "Manchester@2901"
	 *  com.mysql.cj.jdbc.Driver
	 */
	
	public static Connection connection = null;
	public Connectivity() {
		
	}
	
	public static Connection getConnection() throws Exception {
		
		if(connection==null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sbatch6", "root", "Manchester@2901");
		}
		
		return connection;
	}
	
}
