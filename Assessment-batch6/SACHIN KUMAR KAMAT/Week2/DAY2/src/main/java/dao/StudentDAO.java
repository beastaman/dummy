package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Entity.Student;

public class StudentDAO {
		
	public boolean insertStudent(Student student) throws Exception {
		
		Connection connection = Connectivity.getConnection();
		String qry = "insert into student values (?,?,?,?,?)";
		
		PreparedStatement ps = connection.prepareStatement(qry);
		
		ps.setString(1, student.getId());
		ps.setString(2, student.getFname());
		ps.setString(3, student.getLname());
		ps.setString(4, student.getDob());
		ps.setString(5, student.getArea());
		
		ps.executeUpdate();
		
		return true;
	}
	
	public List<Student> getStudents() throws Exception {
		
		Connection connection = Connectivity.getConnection();
		List<Student> list = new ArrayList();
		
		String qry = "select * from student";
		PreparedStatement ps = connection.prepareStatement(qry);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			list.add(new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
					rs.getString(5)));
		}
		
		return list;
	}
	
}
