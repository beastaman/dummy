package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Constant.Constant;
import com.to.Customer;
import com.to.User;

public class CustomerDao {
public List<Customer> getAllCustomer() throws Exception{
		
		
		List<Customer> customers = new ArrayList<>();
		
		Connection connection =Connectivity.getConnection();
		
		 PreparedStatement preparedStatement = connection.prepareStatement(Constant.Get_All_Customer);
		 //String query = connection.preparedStatement();//"Select * from student";// constant.Get_All_Student
				 
		
		 ResultSet resultSet = preparedStatement.executeQuery();
		 
		
		 while(resultSet.next()) {
				customers.add(new Customer(resultSet.getString(1) , resultSet.getString(2) ,resultSet.getString(3) ,resultSet.getString(4) ,resultSet.getString(5)));
				
			}
			
				
		
		return customers;
		
	}
	public void insertCustomer(Customer customer) throws Exception{
		Connection connection =Connectivity.getConnection();
		System.out.println("inside insert customer");
		 //String query = "Select * from student";// constant.saveStudent
		 PreparedStatement preparedStatement = connection.prepareStatement(Constant.saveCustomer);
		
		 System.out.println("constant query prepared");
		 preparedStatement.setString(1, customer.getCid());
		 preparedStatement.setString(2, customer.getFname());
		 preparedStatement.setString(3, customer.getLname());
		 preparedStatement.setString(4, customer.getPhone());
		 preparedStatement.setString(5, customer.getArea());
		preparedStatement.executeUpdate();
		 //preparedStatement.setString(1, student.get;
		
		
	}
	
	public Customer getCustomer(String id) throws Exception {
		Connection connection =Connectivity.getConnection();
		
		 String query = "Select * from Customer where cid =? ";
		 PreparedStatement preparedStatement = connection.prepareStatement(query);
		 // pointer will be now at BOF -- play when we go to next , it will go to the first record
		// System.out.println(user.getUserid() + " , " + user.getUserpassword());
		 
		 
		 preparedStatement.setString(1 , id);
		 
		 
		 ResultSet resultSet = preparedStatement.executeQuery();
		//if(preparedStatement.executeQuery().next())
		 if(resultSet.next()) {
				Customer customer = new Customer(resultSet.getString(1) , resultSet.getString(2) ,resultSet.getString(3) ,resultSet.getString(4) ,resultSet.getString(5));
				return customer ;
			}
			
			else {
				throw new Exception("Username and password deosnot match :: " + id );
			}		 
	}

}
