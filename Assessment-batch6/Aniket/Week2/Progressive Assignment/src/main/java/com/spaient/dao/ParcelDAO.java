package com.spaient.dao;

import com.spaient.dbconnection.MySQLConnection;
import com.spaient.entity.DeliveryStatus;
import com.spaient.entity.Parcel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ParcelDAO {
    public void addParcel(Parcel parcel) throws SQLException {
        Connection connection = MySQLConnection.getConnection();

        PreparedStatement preparedStatement =
                connection.prepareStatement("INSERT INTO parcel (branch_id, customer_id, status) VALUES(?, ?, ?)");
        preparedStatement.setInt(1, parcel.getBranchId());
        preparedStatement.setInt(2, parcel.getCustomerId());
        preparedStatement.setString(3, (parcel.getStatus().name()));

        preparedStatement.executeUpdate();
    }

    public List<Parcel> getAllParcels() throws SQLException {
        Connection connection = MySQLConnection.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM parcel");

        return getParcelsByPreparedStatement(preparedStatement);
    }

    public List<Parcel> getAllParcelByCustomer(Integer customerId) throws SQLException {
        Connection connection = MySQLConnection.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM parcel WHERE customer_id = ?");
        preparedStatement.setString(1, customerId.toString());

        return getParcelsByPreparedStatement(preparedStatement);
    }

    public List<Parcel> getAllParcelByBranch(Integer branchId) throws SQLException {
        Connection connection = MySQLConnection.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM parcel WHERE branch_id = ?");
        preparedStatement.setString(1, branchId.toString());

        return getParcelsByPreparedStatement(preparedStatement);
    }

    private List<Parcel> getParcelsByPreparedStatement(PreparedStatement preparedStatement) throws SQLException {
        ResultSet resultSet = preparedStatement.executeQuery();

        List<Parcel> parcelList = new ArrayList<>();

        while (resultSet.next()) {
            parcelList.add(new Parcel(
                    resultSet.getInt(1),
                    resultSet.getInt(2),
                    DeliveryStatus.valueOf(resultSet.getString(3))
            ));
        }

        return parcelList;
    }
}
