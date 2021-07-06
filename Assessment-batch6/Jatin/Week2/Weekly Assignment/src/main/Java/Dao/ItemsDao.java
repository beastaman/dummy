package com.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.DBConnectivity.Connectivity;
import com.Exception.invalidId;
import com.constants.Constants;

public class ItemsDao {

	public List<String> getAllItemsOfBranch(int bid) throws invalidId, Exception {
		String sql = Constants.GetAllItemsInTheBranch;

		List<String> allItemsInBranch = new ArrayList<>();
		try {
			PreparedStatement ps = Connectivity.getConnection().prepareStatement(sql);
			ps.setInt(1, bid);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				allItemsInBranch.add(rs.getString(1));
			}
		} catch (invalidId e) {
			throw new invalidId();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allItemsInBranch;
	}
}
