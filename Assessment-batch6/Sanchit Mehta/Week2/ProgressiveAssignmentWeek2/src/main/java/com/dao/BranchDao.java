package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.constant.Constants;
import com.to.Branch;


public class BranchDao {

	public List<Branch> getAllBranches() throws Exception {

		Connection connection = Connectivity.getConnection();
		// constant or resources

		PreparedStatement preparedStatement = connection.prepareStatement(Constants.LIST_BRANCHES);

		ResultSet resultSet = preparedStatement.executeQuery();

		List<Branch> branches = new ArrayList<>();

		while (resultSet.next()) {
			branches.add(new Branch(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3),
					resultSet.getInt(4)));
		}
		
		return branches;
	}
}
