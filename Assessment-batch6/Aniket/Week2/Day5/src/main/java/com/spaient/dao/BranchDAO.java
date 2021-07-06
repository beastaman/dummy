package com.spaient.dao;

import com.spaient.dbconnection.MySQLConnection;
import com.spaient.entity.Branch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BranchDAO {
    public List<Branch> getAllBranches() throws SQLException {
        Connection connection = MySQLConnection.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM branch");

        ResultSet resultSet = preparedStatement.executeQuery();

        List<Branch> branchList = new ArrayList<>();

        while (resultSet.next()) {
            branchList.add(new Branch(
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getInt(3)));
        }
        return branchList;
    }

    public Branch getBranchById(Integer branchId) throws SQLException {
        Connection connection = MySQLConnection.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM branch WHERE branch_id = ?");
        preparedStatement.setString(1, String.valueOf(branchId));

        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        return new Branch(
                resultSet.getString(1),
                resultSet.getString(2),
                resultSet.getInt(3));
    }
}
