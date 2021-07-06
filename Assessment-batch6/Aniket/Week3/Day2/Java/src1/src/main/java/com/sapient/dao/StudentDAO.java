package com.sapient.dao;

import com.sapient.to.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    public List<Student> getAllStudent() throws Exception {
        List<Student> students = new ArrayList<Student>();
        Connection connection = Connectivity.getConnection();

        String query = "SELECT * FROM students";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        //resultset pointer will be on bof  -> it will go on first record on next()
        while (resultSet.next()) {
            students.add(new Student(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)
                    , resultSet.getString(4), resultSet.getString(5)));
        }
        return students;
    }

    public Student getAnyStudent(String id) throws Exception {
        Student student = new Student();
        Connection connection = Connectivity.getConnection();

        String query = "SELECT * FROM students where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        //resultset pointer will be on bof  -> it will go on first record on next()
        if (resultSet.next()) {
            student = new Student(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)
                    , resultSet.getString(4), resultSet.getString(5));
        } else {
            throw new Exception("User does not exist");
        }
        return student;
    }

    public boolean insertStudentData(Student student) throws Exception {
        Connection connection = Connectivity.getConnection();

        String query = "INSERT into students values (?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, student.getId());
        preparedStatement.setString(2, student.getFname());
        preparedStatement.setString(3, student.getLname());
        preparedStatement.setString(4, student.getDob());
        preparedStatement.setString(5, student.getArea());

        return preparedStatement.executeUpdate() > 0;

    }

    public boolean updateStudentArea(String id, String area) throws Exception {
        Connection connection = Connectivity.getConnection();
        String query = " UPDATE students SET area=? where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, area);
        preparedStatement.setString(2, id);
        return preparedStatement.executeUpdate() > 0;

    }

    public boolean deleteStudent(String id) throws Exception {
        Connection connection = Connectivity.getConnection();
        String query = " DELETE from students where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, id);
        return preparedStatement.executeUpdate() > 0;
    }

    public void joinTwoTables() throws Exception {
        Connection connection = Connectivity.getConnection();
        String query = "SELECT * FROM students natural join marks ";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
//		preparedStatement.setString(1,table1);
//		preparedStatement.setString(2, table2);
        ResultSet resultSet = preparedStatement.executeQuery();
        ResultSetMetaData rsmd = resultSet.getMetaData();
        int column_count = rsmd.getColumnCount();
        while (resultSet.next()) {
            for (int i = 1; i <= column_count; ++i) {
                System.out.print(resultSet.getString(i) + "\t");
            }
            System.out.println();
        }
    }
}
