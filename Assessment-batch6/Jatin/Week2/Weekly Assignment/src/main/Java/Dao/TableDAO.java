package com.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.DBConnectivity.Connectivity;
import com.Exception.invalidId;
import com.constants.Constants;

public class TableDAO {

	public List<Integer> getAllTableUnreservedInBranch(int branchid) throws invalidId, Exception {
		String sql = Constants.getAllTableUnreservedBranch;

		List<Integer> tables = new ArrayList<>();
		try {
			PreparedStatement ps = Connectivity.getConnection().prepareStatement(sql);
			ps.setInt(1, branchid);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				tables.add(rs.getInt(1));
			}
		} catch (invalidId e) {
			throw new invalidId();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tables;
	}
	/*
	 * public List<Integer> reserveTable(int tableid, String starttime, String
	 * endtime) throws Exception { SimpleDateFormat formatter=new
	 * SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
	 * if(LocalDateTime.now().isAfter((ChronoLocalDateTime)
	 * formatter.parse(starttime)) &&
	 * LocalDateTime.now()<formatter.parse(starttime)) List<Integer> tables = new
	 * ArrayList<>(); try { PreparedStatement ps =
	 * Connectivity.getConnection().prepareStatement(sql); ps.setString(1,
	 * branchid); ResultSet rs = ps.executeQuery();
	 * 
	 * while (rs.next()) { tables.add(rs.getInt(1)); } } catch (SQLException e) {
	 * e.printStackTrace(); } return tables; }
	 */
}
