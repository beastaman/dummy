package com.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity {
	
	private static Connection connection = null;
	
	private Connectivity() {}
	
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if(connection==null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String dbUrl = "jdbc:mysql://localhost:3306/psi_asde";
			String username= "root";
			String password = "root";
			
			connection = DriverManager.getConnection(dbUrl, username, password);
		}
		
		return connection;
	}
	
}
