package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.constant.Constants;
import com.to.Branch;

public class BranchDao {
	public List<Branch> getAllBranch() throws Exception {

		Connection connection = Connectivity.getConnection();
		// constant or resources

		PreparedStatement preparedStatement = connection.prepareStatement(Constants.GET_ALL_BRANCH_QUERY);

		ResultSet resultSet = preparedStatement.executeQuery();

		List<Branch> branches = new ArrayList<>();

		while (resultSet.next()) {
			branches.add(new Branch(resultSet.getString(1), resultSet.getString(2)));
		}
		
		return branches;
	}
}
