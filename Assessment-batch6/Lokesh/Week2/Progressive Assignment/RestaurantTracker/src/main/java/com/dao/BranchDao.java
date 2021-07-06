package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.constant.Constants;
import com.to.Branch;



public class BranchDao {
public List<Branch> getBranch() throws Exception {
	
		
		Connection connection = Connectivity.getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement(Constants.GET_ALL_BRANCH);
		
		ResultSet resultSet = preparedStatement.executeQuery();

		List<Branch> branches = new ArrayList<>();
		//System.out.println("helooo from branchDao");

		while (resultSet.next()) {
			branches.add(new Branch(resultSet.getString(1), resultSet.getString(2),resultSet.getString(3)));
		}
		
		return branches;
		
	}

}
