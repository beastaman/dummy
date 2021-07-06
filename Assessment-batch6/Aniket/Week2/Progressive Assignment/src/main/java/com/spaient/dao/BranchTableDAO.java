package com.spaient.dao;

import com.spaient.dbconnection.MySQLConnection;
import com.spaient.entity.BranchTable;
import com.spaient.entity.TableStatus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BranchTableDAO {

    public TableStatus getTableStatusById(Integer tableId) throws SQLException {
        Connection connection = MySQLConnection.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT table_status FROM branch_table WHERE table_id = ?");
        preparedStatement.setString(1, String.valueOf(tableId));

        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        return TableStatus.valueOf(resultSet.getString(1));

    }

    public void occupyTable(Integer branchTableId) throws SQLException {
        Connection connection = MySQLConnection.getConnection();

        PreparedStatement preparedStatement =
                connection.prepareStatement("UPDATE branch_table SET table_status = 'OCCUPIED' WHERE table_id = ?");
        preparedStatement.setString(1, String.valueOf(branchTableId));

        preparedStatement.executeUpdate();
    }

    public void freeTable(BranchTable branchTable) throws SQLException {
        Connection connection = MySQLConnection.getConnection();

        PreparedStatement preparedStatement =
                connection.prepareStatement("UPDATE branch_table SET table_status = 'FREE' WHERE branch_id = ? AND table_id = ?");
        preparedStatement.setString(1, String.valueOf(branchTable.getBranchId()));
        preparedStatement.setString(2, String.valueOf(branchTable.getTableId()));

        preparedStatement.executeUpdate();
    }

    public BranchTable getFreeTableById(Integer tableId) throws SQLException {
        Connection connection = MySQLConnection.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM branch_table WHERE table_id = ? AND table_status = 'FREE'");
        preparedStatement.setString(1, String.valueOf(tableId));

        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();

        return new BranchTable(
                TableStatus.valueOf(resultSet.getString(1)),
                resultSet.getInt(2),
                resultSet.getInt(3),
                resultSet.getInt(4));
    }

    public BranchTable getTableById(Integer tableId) throws SQLException {
        Connection connection = MySQLConnection.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM branch_table WHERE table_id = ?");
        preparedStatement.setString(1, String.valueOf(tableId));

        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();

        return new BranchTable(
                TableStatus.valueOf(resultSet.getString(1)),
                resultSet.getInt(2),
                resultSet.getInt(3),
                resultSet.getInt(4));
    }

    public List<BranchTable> getFreeTable() throws SQLException {
        Connection connection = MySQLConnection.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM branch_table WHERE table_status = 'FREE'");

        return getBranchTablesWithPreparedStatement(preparedStatement);
    }

    public List<BranchTable> getAllTables() throws SQLException {
        Connection connection = MySQLConnection.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM branch_table");

        return getBranchTablesWithPreparedStatement(preparedStatement);
    }

    public List<BranchTable> getAllTablesByBranch(Integer branchId) throws SQLException {
        Connection connection = MySQLConnection.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM branch_table WHERE branch_id = ?");
        preparedStatement.setString(1, String.valueOf(branchId));

        return getBranchTablesWithPreparedStatement(preparedStatement);
    }

    private List<BranchTable> getBranchTablesWithPreparedStatement(PreparedStatement preparedStatement) throws SQLException {
        ResultSet resultSet = preparedStatement.executeQuery();

        List<BranchTable> branchTableList = new ArrayList<>();

        while (resultSet.next()) {
            branchTableList.add(new BranchTable(
                    TableStatus.valueOf(resultSet.getString(1)),
                    resultSet.getInt(2),
                    resultSet.getInt(3),
                    resultSet.getInt(4)));
        }

        return branchTableList;
    }
}
