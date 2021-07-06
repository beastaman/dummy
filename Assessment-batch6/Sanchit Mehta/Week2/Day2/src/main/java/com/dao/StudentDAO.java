package com.dao;
import java.sql.*;
import java.util.*;
import com.to.Student;
import com.to.Marks;
import com.to.StudentAndMarks;
public class StudentDAO {

	public List<StudentAndMarks> joinStudentAndMarks () throws Exception
	{
		List<StudentAndMarks> studentAndMarks= new ArrayList<>();
		Connection connection= Connectivity.getConnection();
		String query= "SELECT * from Student NATURAL JOIN Marks";
		PreparedStatement ps= connection.prepareStatement(query);
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			studentAndMarks.add(new StudentAndMarks(rs.getString(1),rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5),rs.getInt(6), rs.getInt(7),rs.getInt(8), rs.getInt(9)));
			//resultSet pointer will be at (bottom) BOF-> only when we go to next, it will go to the first record
			
		}
		return studentAndMarks;
		

	}
	
	public Boolean DeleteStudentRecord(String id) throws Exception
	{
		Connection connection= Connectivity.getConnection();
		String query= "DELETE from Student WHERE id = ?";
		PreparedStatement ps= connection.prepareStatement(query);
		ps.setString(1, id);
		ps.executeUpdate();
		return true;
		
	}
	
	public Boolean UpdateStudentRecord(Student student, String id) throws Exception
	{
		Connection connection =Connectivity.getConnection();
		String query= "UPDATE student set id= ?, fname= ?, lname=?, dob=?, area=? where id = ?";
		PreparedStatement ps= connection.prepareStatement(query);
		ps.setString(1, student.getId());
		ps.setString(2, student.getFname());
		ps.setString(3, student.getLname());
		ps.setString(4, student.getDob());
		ps.setString(5, student.getArea());
		ps.setString(6, id);
		ps.executeUpdate();
		
		
		return false;
	}
	
	
	public Boolean saveStudent(Student student ) throws Exception
	{
		
		Connection connection = Connectivity.getConnection();
				
		String query= "insert into student values (?, ?, ?, ?, ?)";
		PreparedStatement ps= connection.prepareStatement(query);
		ps.setString(1, student.getId());
		ps.setString(2, student.getFname());
		ps.setString(3, student.getLname());
		ps.setString(4, student.getDob());
		ps.setString(5, student.getArea());
		ps.executeUpdate(); //use update instead of query in insert, delete, and update statements 
		return true;
	}
	public Student getAnyStudent(String id) throws Exception
	{
		Student student;
		Connection connection = Connectivity.getConnection();
				
		String query= "SELECT * from student where id= ?";
		PreparedStatement ps= connection.prepareStatement(query);
		ps.setString(1, id);
		ResultSet rs= ps.executeQuery();
		if(rs.next()) {
			student = new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
		}
		else
		{
			throw new Exception ("User does not exist");
		}
		return student;
	}
	public List<Student> getAllStudent() throws Exception
	{
		List<Student> students= new ArrayList<Student>();
		Connection connection = Connectivity.getConnection();
		
		//statement -> multiple query | PS-> for single query (fasteR)
		
		String query= "SELECT * from student";
		PreparedStatement ps= connection.prepareStatement(query);
		
		ResultSet resultSet= ps.executeQuery();
		while(resultSet.next())
		{
			//resultSet pointer will be at (bottom) BOF-> only when we go to next, it will go to the first record
			students.add(new Student(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5)));
		}
		return students;
		
	}
}
