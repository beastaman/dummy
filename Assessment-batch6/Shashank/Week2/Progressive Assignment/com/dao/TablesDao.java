package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Constant.Constant;
import com.to.Service;
import com.to.Tables;

public class TablesDao {
	

public List<Tables> getAllTables() throws Exception{
		
		
		List<Tables> tables = new ArrayList<>();
		
		Connection connection =Connectivity.getConnection();
		
		 PreparedStatement preparedStatement = connection.prepareStatement(Constant.Get_All_Tables);
		 //String query = connection.preparedStatement();//"Select * from student";// constant.Get_All_Student
				 
		
		 ResultSet resultSet = preparedStatement.executeQuery();
		 
		
		 while(resultSet.next()) {
			 tables.add(new Tables(resultSet.getString(1) , resultSet.getString(2) ,resultSet.getString(3) ,resultSet.getString(4) ));
				
			}
			
				
		
		return tables;
		
	}

		public List<Tables> getAvailableTables() throws Exception{
			
			
			List<Tables> tables = new ArrayList<>();
			
			Connection connection =Connectivity.getConnection();
			
			 PreparedStatement preparedStatement = connection.prepareStatement(Constant.Get_Available_Tables);
			 //String query = connection.preparedStatement();//"Select * from student";// constant.Get_All_Student
					 
			
			 ResultSet resultSet = preparedStatement.executeQuery();
			 
			
			 while(resultSet.next()) {
				 tables.add(new Tables(resultSet.getString(1) , resultSet.getString(2) ,resultSet.getString(3) ,resultSet.getString(4) ));
					
				}
				
					
			
			return tables;
			
		}
	public void insertTables(Tables tables) throws Exception{
		Connection connection =Connectivity.getConnection();
		System.out.println("inside insert Tables");
		 //String query = "Select * from student";// constant.saveStudent
		 PreparedStatement preparedStatement = connection.prepareStatement(Constant.saveService);
		
		 System.out.println("constant query prepared");
		 preparedStatement.setString(1, tables.getTid());
		 preparedStatement.setString(2, tables.getBid());
		
		 preparedStatement.setString(3, tables.getBooked());
		 preparedStatement.setString(4, tables.getStatus());
		preparedStatement.executeUpdate();
		 //preparedStatement.setString(1, student.get;
		
		
	}
	
	public Tables getTables(String id) throws Exception {
		Connection connection =Connectivity.getConnection();
		
		 String query = "Select * from Tables where tid =? ";
		 PreparedStatement preparedStatement = connection.prepareStatement(query);
		 // pointer will be now at BOF -- play when we go to next , it will go to the first record
		// System.out.println(user.getUserid() + " , " + user.getUserpassword());
		 
		 
		 preparedStatement.setString(1 , id);
		 
		 
		 ResultSet resultSet = preparedStatement.executeQuery();
		//if(preparedStatement.executeQuery().next())
		 if(resultSet.next()) {
			 Tables tables = new Tables(resultSet.getString(1) , resultSet.getString(2) ,resultSet.getString(3) ,resultSet.getString(4) );
				return tables ;
			}
			
			else {
				throw new Exception("Username of Tables deosnot match :: " + id );
			}		 
	}


}
