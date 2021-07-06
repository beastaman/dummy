package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectivity {
	
	public static Connection connect = null;
	
	//public Connectivity() {}
	
	public static Connection getConnection() throws Exception { 
		if(connect == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3307/sbatch6","root","Vikas@1999");
			//System.out.println(connect);
		}
	
		return connect;
	}
}
