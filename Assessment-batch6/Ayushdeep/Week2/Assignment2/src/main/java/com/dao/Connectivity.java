package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

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
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sbatch6" , "root" , "Kanika#123");
			
		}
		
		return connection;
	}

}
