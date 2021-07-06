package com.sapient.dao;

import com.sapient.constants.Constants;
import com.sapient.entity.Student;
import com.sapient.service.DbService;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    private static Connection con;
    static {
        try {
            con = DbService.getConnection();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static List<Student> findAll() throws Exception{
        PreparedStatement ps = con.prepareStatement(Constants.FIND_ALL_STUDENT);
        List<Student> students = new ArrayList<>();
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            students.add(Student.builder()
                    .id(rs.getString(1))
                    .fName(rs.getString(2))
                    .lName(rs.getString(3))
                    .dob(rs.getString(4))
                    .area(rs.getString(5))
                    .phone(rs.getString(6))
                    .build()
            );
        }
        return students;
    }
}
