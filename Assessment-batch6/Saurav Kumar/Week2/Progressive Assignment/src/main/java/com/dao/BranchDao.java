package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.to.Branch;
import com.to.User;

public class BranchDao {
	
	public Branch getBranch(String location) throws Exception {
		Connection connection = Connectivity.getConnection();
		
		String query = "select * from branch where location = ?";
		PreparedStatement preparedStudent = connection.prepareStatement(query);
		preparedStudent.setString(1, location);
		
		ResultSet resultSet = preparedStudent.executeQuery();
		
		Branch branch = null;
		
		if(resultSet.next()) {
			branch = new Branch(resultSet.getString(1), 
					resultSet.getString(2), 
					resultSet.getInt(3),
					resultSet.getInt(4));
			
		} else {
			throw new Exception("userId and Password doesn't match");
		}
		
		return branch;
	}
	
	public void updateBranch(String id, int currentTables) throws Exception {
		Connection connection = Connectivity.getConnection();
		
		String str = ""+currentTables;
		
		String query = "update branch set available = ? where bid = ?";
		PreparedStatement preparedStudent = connection.prepareStatement(query);
		preparedStudent.setString(1, str);
		preparedStudent.setString(2, id);
		
		preparedStudent.executeUpdate();
	}
	
}
