package com.dao;

import com.to.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class StudentDAO {
    public List<Student> getAllStudent() throws Exception {

        List<Student> students = new ArrayList<>();
        Connection connection = Connectivity.getConnection();

        String query = "Select * from student";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            students.add(new Student(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
                    resultSet.getString(4), resultSet.getString(5), resultSet.getString(6)));
        }

        return students;

    }

}















