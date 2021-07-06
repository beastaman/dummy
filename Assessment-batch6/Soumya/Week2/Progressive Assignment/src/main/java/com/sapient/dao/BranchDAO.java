package com.sapient.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sapient.connector.Connectivity;
import com.sapient.entity.Branch;
import com.sapient.utils.Constant;

public class BranchDAO {

	public List<Branch> getAllBranch() throws Exception {

		List<Branch> branches = new ArrayList<>();
		Connection connection = Connectivity.getConnection();
		PreparedStatement ps = connection.prepareStatement(Constant.ALL_BRANCH);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			branches.add(new Branch(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
		}
		return branches;
	}
}
