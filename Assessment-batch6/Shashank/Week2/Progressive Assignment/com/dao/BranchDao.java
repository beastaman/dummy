package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Constant.Constant;
import com.to.Branch;
import com.to.Customer;

public class BranchDao {
	

public List<Branch> getAllBranch() throws Exception{
		
		
		List<Branch> branchs = new ArrayList<>();
		
		Connection connection =Connectivity.getConnection();
		
		 PreparedStatement preparedStatement = connection.prepareStatement(Constant.Get_All_Branch);
		 //String query = connection.preparedStatement();//"Select * from student";// constant.Get_All_Student
				 
		
		 ResultSet resultSet = preparedStatement.executeQuery();
		 
		
		 while(resultSet.next()) {
			 branchs.add(new Branch(resultSet.getString(1) , resultSet.getString(2) ,resultSet.getString(3) ,resultSet.getString(4) ));
				
			}
			
				
		
		return branchs;
		
	}
	public void insertBranch(Branch branch) throws Exception{
		Connection connection =Connectivity.getConnection();
		System.out.println("inside insert Branch");
		 //String query = "Select * from student";// constant.saveStudent
		 PreparedStatement preparedStatement = connection.prepareStatement(Constant.saveBranch);
		
		 System.out.println("constant query prepared");
		 preparedStatement.setString(1, branch.getBid());
		 preparedStatement.setString(2, branch.getBmanager());
		
		 preparedStatement.setString(3, branch.getPhone());
		 preparedStatement.setString(4, branch.getArea());
		preparedStatement.executeUpdate();
		 //preparedStatement.setString(1, student.get;
		
		
	}
	
	public Branch getBranch(String id) throws Exception {
		Connection connection =Connectivity.getConnection();
		
		 String query = "Select * from Branch where bid =? ";
		 PreparedStatement preparedStatement = connection.prepareStatement(query);
		 // pointer will be now at BOF -- play when we go to next , it will go to the first record
		// System.out.println(user.getUserid() + " , " + user.getUserpassword());
		 
		 
		 preparedStatement.setString(1 , id);
		 
		 
		 ResultSet resultSet = preparedStatement.executeQuery();
		//if(preparedStatement.executeQuery().next())
		 if(resultSet.next()) {
			 Branch branch = new Branch(resultSet.getString(1) , resultSet.getString(2) ,resultSet.getString(3) ,resultSet.getString(4) );
				return branch ;
			}
			
			else {
				throw new Exception("Username and password deosnot match :: " + id );
			}		 
	}

}
