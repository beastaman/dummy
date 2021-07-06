package com.sapient.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectivity {
	
	private static Connection connection = null;
	
	public Connectivity() {}
	
	public static Connection getConnection() throws Exception {
		
		if (connection == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sbatch6", "root", "root");
		}
		
		return connection;
	}

}
