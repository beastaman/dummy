package com.sapient.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sapient.entity.Branch;

public class BranchDAO {
	public List<Branch> getAllBranches() throws Exception {
		Connection connection = Connectivity.getConnection();
		String query = "select * from branch";
		PreparedStatement ps = connection.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		List<Branch> branches = new ArrayList<>();
		while (rs.next() == true) {
			branches.add(new Branch(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
		} // wh
		return branches;
	}
}
