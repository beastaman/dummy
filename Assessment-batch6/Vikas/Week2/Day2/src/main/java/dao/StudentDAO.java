package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Entity.Marks;
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
	
	public boolean deleteStudent(String id) throws Exception {
		
		Connection connection = Connectivity.getConnection();
		String qry = "delete from student where id = ?";
		
		PreparedStatement ps = connection.prepareStatement(qry);
		
		ps.setString(1, id);
		
		ps.executeUpdate();
		
		return true;
	}
	


	public boolean updateStudent(String id, Student student) throws Exception {
	
		Connection connection = Connectivity.getConnection();
		String qry = "update student set fname = ?, lname = ? where id = ?";
		
		PreparedStatement ps = connection.prepareStatement(qry);
		
		ps.setString(1, student.getFname());
		ps.setString(2, student.getLname());
		ps.setString(3, id);
		
		ps.executeUpdate();
		
		return true;
	}
	
//	public Student joinStudentMarks(String id, int testno) throws Exception{
//		
//		Connection connection = Connectivity.getConnection();
//		String qry = "select s.fname, s.lname from student s INNER JOIN marks m where s.id = m.id AND sid = ?"
//				+ "AND m.testno = ?";
//		
//		PreparedStatement ps = connection.prepareStatement(qry);
//		
//		ps.setString(1, id);
//		ps.setInt(2,testno);
//		
//		MarksDAO marksdao = new MarksDAO();
//		Marks mark = marksdao.getMarks(id, testno);
//		
//		return null;
//	}
}
