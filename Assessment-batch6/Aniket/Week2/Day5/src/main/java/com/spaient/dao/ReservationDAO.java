package com.spaient.dao;

import com.spaient.dbconnection.MySQLConnection;
import com.spaient.entity.Reservation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReservationDAO {

    public void addReservation(Reservation reservation) throws SQLException {
        Connection connection = MySQLConnection.getConnection();

        PreparedStatement preparedStatement =
                connection.prepareStatement("INSERT INTO reservation (customer_id, table_id) VALUES(?, ?)");
        preparedStatement.setInt(1, reservation.getCustomerId());
        preparedStatement.setInt(2, reservation.getTableId());

        preparedStatement.executeUpdate();
    }

    public List<Reservation> getReservationByCustomer(Integer customerId) throws SQLException {
        Connection connection = MySQLConnection.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM reservation WHERE customer_id = ?");
        preparedStatement.setString(1, customerId.toString());

        return getReservationsByPreparedStatement(preparedStatement);
    }

    private List<Reservation> getReservationsByPreparedStatement(PreparedStatement preparedStatement) throws SQLException {
        ResultSet resultSet = preparedStatement.executeQuery();

        List<Reservation> parcelList = new ArrayList<>();

        while (resultSet.next()) {
            parcelList.add(new Reservation(
                    resultSet.getInt(1),
                    resultSet.getInt(2),
                    resultSet.getInt(3)));
        }
        return parcelList;
    }
}