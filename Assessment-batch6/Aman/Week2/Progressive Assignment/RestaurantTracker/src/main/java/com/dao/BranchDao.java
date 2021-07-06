package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import com.to.*;

public class BranchDao {
	public List<Branch> getAllBranch() throws Exception{
		Connection connection = Connectivity.getConnection();
		String query = "select * from branch";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();
		List<Branch> branchs = new ArrayList<>();
		while (resultSet.next()) {
			branchs.add(new Branch(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)));
		}
		return branchs;
	}
}
