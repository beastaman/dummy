package com.sapient.dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sapient.to.Student;
import com.sapient.to.StudentMarks;

public class StudentDao {

	public List<Student> getAllStudents() throws Exception {
		
		Connection connection = Conectvity.getConnection();
		
		String query = "select * from student";
		PreparedStatement ps = connection.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		
		List<Student> students = new ArrayList<>();
		while(rs.next()) {
			students.add(new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5)));
		}
		
		return students;
	}
	
	public Student getStudentById(String id) throws Exception {
				
		Connection connection = Conectvity.getConnection();
		
		String query = "select * from student where id=?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, id);
		ResultSet rs = ps.executeQuery();
		
		Student student = null;
		if(rs.next()) {
			student = new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5));
		}
		else throw new Exception("Student does not exist!");
		
		return student;
	}
	
	public boolean saveStudent(Student student) throws Exception {
		
		Connection connection = Conectvity.getConnection();
		
		String query = "insert into student values(?,?,?,?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, student.getId());
		ps.setString(2, student.getFname());
		ps.setString(3, student.getLname());
		ps.setDate(4, student.getDob());
		ps.setString(5, student.getArea());
		
		int rs = ps.executeUpdate();

		return rs > 0;
	}
	
	public boolean updateStudent(Student student) throws Exception {
		
		Connection connection = Conectvity.getConnection();
		
		String query = "update student set fname=?, lname=?, dob=?, area=? where id=?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, student.getFname());
		ps.setString(2, student.getLname());
		ps.setDate(3, student.getDob());
		ps.setString(4, student.getArea());
		ps.setString(5, student.getId());
		
		int rs = ps.executeUpdate();

		return rs > 0;
	}
	
	public boolean deleteStudent(String id) throws Exception {
		
		Connection connection = Conectvity.getConnection();
		
		String query = "delete from student where id=?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, id);
		
		int rs = ps.executeUpdate();

		return rs > 0;
	}
	
	public List<StudentMarks> getStudentMarks() throws Exception {
		
		Connection connection = Conectvity.getConnection();
		
		String query = "select s.id, Trim(Concat(s.fname, ' ', s.lname)) AS name, m.testno, (m.m1+m.m2+m.m3) total from student s natural join marks m";
		PreparedStatement ps = connection.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		
		List<StudentMarks> studentMarks = new ArrayList<>();
		while(rs.next()) {
			studentMarks.add(new StudentMarks(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
		}
		
		return studentMarks;
	}
}
