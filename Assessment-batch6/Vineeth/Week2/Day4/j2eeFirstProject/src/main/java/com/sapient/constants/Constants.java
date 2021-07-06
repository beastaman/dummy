package com.sapient.constants;

public class Constants {

	public static final String GET_USER_FROM_CREDENTIALS_QUERY = "select * from user where id=? and password=?";

	public static final String GET_ALL_STUDENT_QUERY = "select * from student";

	public static final String GET_STUDENT_BY_ID_QUERY = "select * from student where id=?";
	
	public static final String INSERT_STUDENT_QUERY ="insert into student values(?,?,?,?,?)";
	
	public static final String UPDATE_STUDENT_QUERY ="update student set fname=?, lname=?, dob=?, area=? where id=?";
	
	public static final String DELETE_STUDENT_QUERY ="delete from student where id=?";

}
