package com.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.DBConnectivity.Connectivity;
import com.constants.Constants;
import com.entity.Branches;

public class BranchesDAO {

	public List<Branches> getAllBranches() throws Exception {
		String sql = Constants.GetAllFromBranches;

		List<Branches> allBranches = new ArrayList<>();
		try {
			PreparedStatement ps = Connectivity.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				allBranches.add(new Branches(rs.getInt(1), rs.getString(2), rs.getInt(3)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allBranches;
	}
}
