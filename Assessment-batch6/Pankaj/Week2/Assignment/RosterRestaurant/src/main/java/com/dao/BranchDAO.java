package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.to.Branch;

public class BranchDAO {
	public List<Branch> getAllBranches() throws Exception {
		// TODO Auto-generated method stub
		Connection connection = Connectivity.getConnection();
		String query = "select * from branch";
		PreparedStatement preparedStatement = connection.prepareStatement(query);

		ResultSet resultSet = preparedStatement.executeQuery();
		List<Branch> branches = new ArrayList<>();
		if (resultSet.next() == true) {
			branches.add(new Branch(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4), resultSet.getString(5)));
		} // if
		return branches;
	}
}
