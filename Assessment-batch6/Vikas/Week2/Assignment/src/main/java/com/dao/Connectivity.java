package com.dao;

import java.sql.*;

public class Connectivity {

	public static Connection connection = null;
	public Connectivity() {
		
	}
	
	public static Connection getConnection() throws Exception {
		
		if(connection==null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/pa2", "root", "Vikas@1999");
		}
		
		return connection;
	}
}
