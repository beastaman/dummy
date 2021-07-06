package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Product;
import com.entity.Student;
import com.entity.StudentAndCities;

public class StudentDAO {
	public boolean saveItem(Product p) {
		Connection connection = null;
		try {
			connection = Connectivity.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query = "insert into product(name,brand,madein,price)  values(?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(query);
			ps.setString(1, p.getName());
			ps.setString(2, p.getBrand());
			ps.setString(3, p.getMadein());
			ps.setInt(4, p.getPrice());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public boolean saveStudent(Student s) {
		Connection connection = null;
		try {
			connection = Connectivity.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query = "insert into student values(?,?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(query);
			ps.setString(1, s.getId());
			ps.setString(2, s.getFname());
			ps.setString(3, s.getLname());
			ps.setString(4, s.getDb());
			ps.setString(5, s.getArea());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public static List<Student> getAllStudent() {
		List<Student> list=new ArrayList<>();
		
		Connection connection = null;
		try {
			connection = Connectivity.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String query="Select * from student";
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(query);
			ResultSet rs = null;
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public Student getAnyStudent(String id) {
		Student student = null;
		Connection connection = null;
		try {
			connection = Connectivity.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String query="Select * from student where id=?";
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(query);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				student = new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5));
			}
			// else
			// throw new Exception("User not exist");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return student;
	}

	public List<StudentAndCities> getStudentsAndTheirCity() {
		List<StudentAndCities> list = new ArrayList<>();
		StudentAndCities student = null;
		Connection connection = null;
		try {
			connection = Connectivity.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String query = "select * from student a INNER JOIN city";
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(query);
			ResultSet rs = null;
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new StudentAndCities(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public boolean updateStudentName(String fname, String lname, String id) {
		Connection connection = null;
		try {
			connection = Connectivity.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query = "Upadate student set fname=?, lname=? where id=?";
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(query);
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, id);
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean deleteStudent(String id) {
		Connection connection = null;
		try {
			connection = Connectivity.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query = "delete from student where id=?";
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(query);
			ps.setString(1, id);
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
