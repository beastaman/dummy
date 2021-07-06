package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Constant.Constant;

import com.to.Branch;
import com.to.Service;

public class ServiceDao {

public List<Service> getAllService() throws Exception{
		
		
		List<Service> services = new ArrayList<>();
		
		Connection connection =Connectivity.getConnection();
		
		 PreparedStatement preparedStatement = connection.prepareStatement(Constant.Get_All_Service);
		 //String query = connection.preparedStatement();//"Select * from student";// constant.Get_All_Student
				 
		
		 ResultSet resultSet = preparedStatement.executeQuery();
		 
		
		 while(resultSet.next()) {
			 services.add(new Service(resultSet.getString(1) , resultSet.getString(2) ,resultSet.getString(3) ,resultSet.getString(4) ));
				
			}
			
				
		
		return services;
		
	}
	public void insertService(Service service) throws Exception{
		Connection connection =Connectivity.getConnection();
		System.out.println("inside insert Service");
		 //String query = "Select * from student";// constant.saveStudent
		 PreparedStatement preparedStatement = connection.prepareStatement(Constant.saveService);
		
		 System.out.println("constant query prepared");
		 preparedStatement.setString(1, service.getSid());
		 preparedStatement.setString(2, service.getBid());
		
		 preparedStatement.setString(3, service.getBooked());
		 preparedStatement.setString(4, service.getStatus());
		preparedStatement.executeUpdate();
		 //preparedStatement.setString(1, student.get;
		
		
	}
	
	public Service getService(String id) throws Exception {
		Connection connection =Connectivity.getConnection();
		
		 String query = "Select * from Service where sid =? ";
		 PreparedStatement preparedStatement = connection.prepareStatement(query);
		 // pointer will be now at BOF -- play when we go to next , it will go to the first record
		// System.out.println(user.getUserid() + " , " + user.getUserpassword());
		 
		 
		 preparedStatement.setString(1 , id);
		 
		 
		 ResultSet resultSet = preparedStatement.executeQuery();
		//if(preparedStatement.executeQuery().next())
		 if(resultSet.next()) {
			 Service service = new Service(resultSet.getString(1) , resultSet.getString(2) ,resultSet.getString(3) ,resultSet.getString(4) );
				return service ;
			}
			
			else {
				throw new Exception("Username of Service deosnot match :: " + id );
			}		 
	}

}
