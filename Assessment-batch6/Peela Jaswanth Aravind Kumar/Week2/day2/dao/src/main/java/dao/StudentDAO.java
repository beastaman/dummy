package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import to.Student;

public class StudentDAO {
	
	
	public List<entry> getTotalMarks() throws Exception{ 
		List<entry> students = new ArrayList<entry>();
		Connection connection = Connectivity.getConnection();
		
		String query = "select a.fname, (b.m1 + b.m2 + b.m3) 'total marks' from student a inner join marks b on a.id == b.id";
		PreparedStatement ps = connection.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			entry st = new entry(rs.getString(1),rs.getString(2),rs.getInt(3));
			students.add(st);
		}
		return students;
	}
	
	
	public boolean updateStudent(Student st,String condition[]) throws Exception {

		Connection connection = Connectivity.getConnection();
		
		String query = "update student set id = " + st.getId() + ", fname = " + st.getFname() + ", lname = " + st.getLname() +", dob = " + st.getDob() +", area = " + st.getArea() + ", phoneNo = " + st.getPhoneNo();
		
		PreparedStatement ps = connection.prepareStatement(query);
		
		ps.executeUpdate();
//		return true;
		
		return true;
		
	}
	
	public static boolean deleteStudent(String condition[]) throws Exception {
		String query = "delete from student where ";
		for(int i=0;i<condition.length-1;i++) {
			query += (condition[i] + "and");
		}
		query += condition[condition.length - 1];
		Connection connection = Connectivity.getConnection();
		PreparedStatement ps = connection.prepareStatement(query);
		
		ps.executeUpdate();
		
		return true;
		
	}
	
	public Student getAnyStudent(String id) throws Exception{
		Student student=null;
		Connection connection = Connectivity.getConnection();
		String query="SELECT *from student where id= ?";
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		preparedStatement.setString(1, id);
		ResultSet resultSet=preparedStatement.executeQuery();
		//resultset poiter will be at BOF --->
		if(resultSet.next()) {
			student=new Student(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6));
		}
		else {
			throw new Exception("User does not exist");
		}
		return student;
	}
	
	public boolean addStudent(Student st) throws Exception{
		Connection connection = Connectivity.getConnection();
		String query = "insert into student values (?,?,?,?,?,?)";
		
		PreparedStatement ps = connection.prepareStatement(query);
		
		ps.setString(1, st.getId());
		ps.setString(2, st.getFname());
		ps.setString(3, st.getLname());
		ps.setString(4, st.getDob());
		ps.setString(5, st.getArea());
		ps.setString(6,st.getPhoneNo());
		
		ps.executeUpdate();
		return true;
	}
	
	public static List<Student> getAllStudents() throws Exception {
		
		List<Student> students = new ArrayList<Student>();
		Connection connection = Connectivity.getConnection();
		
		String query = "select * from student";
		PreparedStatement ps = connection.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			Student st = new Student(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
			students.add(st);
		}
		return students;
	}
	
}
