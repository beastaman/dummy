package com.DAO;

import java.sql.*;

public class ConnectivityClass {

	public static Connection connection = null;
	public Connectivity() {
		
	}
	
	public static Connection getConnection() throws Exception {
		
		if(connection==null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment2", "root", "Sachin@3122");
		}
		
		return connection;
	}
}
