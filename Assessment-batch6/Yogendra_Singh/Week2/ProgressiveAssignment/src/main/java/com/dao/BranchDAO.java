package com.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.constant.Constant;
import com.to.Branch;

public class BranchDAO {
	public List<Branch> getAllBranches() throws Exception {
		List<Branch> branches = new ArrayList<Branch>();
		Connection connection = Connectivity.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement( Constant.GET_ALL_BRANCHES );
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			branches.add(new Branch(resultSet.getInt(1) ,resultSet.getString(2),resultSet.getString(3)
					, resultSet.getString(4)));
		}
		return branches;
	}
}
