package com.sapient.dao;

import com.sapient.constants.Constants;
import com.sapient.entity.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public static void insert(Student student) throws Exception{
        System.out.println("Inside Student Dao Insert "+ student);
        Connection con = Connectivity.getConnection();
        PreparedStatement ps = con.prepareStatement(Constants.INSERT_STUDENT);
        ps.setString(1, student.getId());
        ps.setString(2, student.getFName());
        ps.setString(3, student.getLName());
        ps.setString(4, student.getDob());
        ps.setString(5, student.getArea());
        ps.setString(6, student.getPhone());
        ps.executeUpdate();
    }

    public static List<Student> findAll() throws Exception{
        System.out.println("Inside Student Dao findAll");
        Connection con = Connectivity.getConnection();
        PreparedStatement ps = con.prepareStatement(Constants.GET_ALL_STUDENT);
        ResultSet rs = ps.executeQuery();
        List<Student> students = new ArrayList<>();
        while (rs.next()){
            students.add(Student.builder()
                    .id(rs.getString(1))
                    .fName(rs.getString(2))
                    .lName(rs.getString(3))
                    .dob(rs.getString(4))
                    .area(rs.getString(5))
                    .phone(rs.getString(6))
                    .build());
        }
        students.forEach(System.out::println);
        return students;
    }
}
