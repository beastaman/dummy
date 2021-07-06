

package com.dao;
import com.to.*;
import java.util.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.to.User;
public class UserDao {
	public UserDao() {}
	
	public User getUser(User user) throws Exception {
		Connection connection =Connectivity.getConnection();
		
		 String query = "Select * from user where userid =? and userpassword=?";
		 PreparedStatement preparedStatement = connection.prepareStatement(query);
		 // pointer will be now at BOF -- play when we go to next , it will go to the first record
		 System.out.println(user.getUserid() + " , " + user.getUserpassword());
		 
		 
		 preparedStatement.setString(1 , user.getUserid());
		 preparedStatement.setString(2 , user.getUserpassword());
		 
		 ResultSet resultSet = preparedStatement.executeQuery();
		//if(preparedStatement.executeQuery().next())
		 if(resultSet.next()) {
				user.setStatus(resultSet.getString(3));
				return  user;
			}
			
			else {
				throw new Exception("Username and password deosnot match :: " + user.getUserid() + " , " + user.getUserpassword());
			}		 
	}
	
	public List<Tables> bookedTable(String id)  throws Exception{
		Connection connection =Connectivity.getConnection();
		
		 String query = "Select * from Tables where booked =? ";
		 PreparedStatement preparedStatement = connection.prepareStatement(query);
		 // pointer will be now at BOF -- play when we go to next , it will go to the first record
		 
		 preparedStatement.setString(1 , id);
		 List<Tables> booked=null;
		 
		 ResultSet resultSet = preparedStatement.executeQuery();
		//if(preparedStatement.executeQuery().next())
		 while(resultSet.next()) {
				booked.add(new Tables(resultSet.getString(1) , resultSet.getString(2),resultSet.getString(3),resultSet.getString(4)));
			
			}
			
			if(booked==null) {
				throw new Exception("You have no tables booked :: ");
			}
			return booked;
		
		
	}
	
	public List<Service> bookedService(String id)  throws Exception{
		Connection connection =Connectivity.getConnection();
		
		 String query = "Select * from Service where booked =? ";
		 PreparedStatement preparedStatement = connection.prepareStatement(query);
		 // pointer will be now at BOF -- play when we go to next , it will go to the first record
		 
		 preparedStatement.setString(1 , id);
		 List<Service> booked=null;
		 
		 ResultSet resultSet = preparedStatement.executeQuery();
		//if(preparedStatement.executeQuery().next())
		 while(resultSet.next()) {
				booked.add(new Service(resultSet.getString(1) , resultSet.getString(2),resultSet.getString(3),resultSet.getString(4)));
			
			}
			
			if(booked==null) {
				throw new Exception("You have no service booked :: ");
			}
			return booked;
		
		
	}

}
