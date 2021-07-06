package com.sapient.dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectvity {
	
	private static Connection connection = null;
	
	public Conectvity() {}
	
	public static Connection getConnection() throws Exception {
		
		if (connection == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sbatch6", "root", "root");
		}
		
		return connection;
	}

}
