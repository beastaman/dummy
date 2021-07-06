
package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
public class Connectivity {
    public static Connection connection =null;
	
	public static Connection getConnection() throws Exception{
		if(connection==null) {
			Class.forName("com.mysql.cj.jdbc.Driver");  // Load the driver
			
			// Since Connection is an interface we cant directly create object of interface so we need  a class which implements the interface 
			// or a method which will return instance of the interface
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "root");
			                                       // URL                    , Username , Password
			// getConnection is a static method so we are using Class name DriverManager to call it
		}
		if(connection!=null) {
			System.out.println("Connection made");
		}
		return connection;
					
		}
		
	
}
