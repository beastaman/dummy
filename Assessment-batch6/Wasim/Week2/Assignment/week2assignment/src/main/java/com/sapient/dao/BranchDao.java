package com.sapient.dao;

import java.sql.*;
import java.util.*;

import com.sapient.entity.Branch;
import com.sapient.utility.*;

public class BranchDao {

	public BranchDao() {

	}

	public List<Branch> getAllBranches() throws Exception {

		List<Branch> branchs = new ArrayList<>();

		Connection connection = Connectivity.getConnection();
		String query = Constant.GET_ALL_BRANCHES;
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			branchs.add(new Branch(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),resultSet.getString(4)));
		}
		
		

		return branchs;

	}
}
