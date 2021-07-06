package com.dao;

import com.dto.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public List<Student> findAll() throws Exception{
        List<Student> list = new ArrayList<>();
        Connection connection = Connectivity.getConnection();
        //Prepared Statement is faster
        PreparedStatement ps = connection.prepareStatement("select * from student");
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            list.add(Student.builder()
                    .id(rs.getString(1))
                    .fName(rs.getString(2))
                    .lName(rs.getString(3))
                    .dob(rs.getString(4))
                    .area(rs.getString(5))
                    .phone(rs.getString(6))
                    .build()
            );
        }
        return list;
    }
    public Student findStudentById(String id) throws Exception{
        Connection connection = Connectivity.getConnection();
        //Prepared Statement is faster
        PreparedStatement ps = connection.prepareStatement("select * from student where id=?");
        ps.setString(1,id);
        ResultSet rs = ps.executeQuery();
        Student student=null;
        if (rs.next()){
             student = Student.builder()
                    .id(rs.getString(1))
                    .fName(rs.getString(2))
                    .lName(rs.getString(3))
                    .dob(rs.getString(4))
                    .area(rs.getString(5))
                     .phone(rs.getString(6))
                    .build();
        }else throw new Exception("Error while fetching data or result is empty");
        return student;
    }

    public void insert(Student student) throws Exception{
        Connection connection = Connectivity.getConnection();
        //Prepared Statement is faster
        PreparedStatement ps = connection.prepareStatement("insert into student values (?,?,?,?,?,?);");
        ps.setString(1,student.getId());
        ps.setString(2,student.getFName());
        ps.setString(3,student.getLName());
        ps.setString(4,student.getDob());
        ps.setString(5, student.getArea());
        ps.setString(6, student.getPhone());
        ps.executeUpdate();
    }

    public void update(String id, String phone) throws Exception{
        Connection connection = Connectivity.getConnection();
        //Prepared Statement is faster
        PreparedStatement ps = connection.prepareStatement("Update student set phone=? where id=?");
        ps.setString(1,phone);
        ps.setString(2, id);
        ps.executeUpdate();
    }

    public void deleteById(String id) throws Exception{
        Connection connection = Connectivity.getConnection();
        //Prepared Statement is faster
        PreparedStatement ps = connection.prepareStatement("Delete from student where id = ?");
        ps.setString(1,id);
        ps.executeUpdate();
    }
}
