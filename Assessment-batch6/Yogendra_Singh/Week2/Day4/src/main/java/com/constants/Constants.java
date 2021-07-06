package com.constants;

public class Constants {
	public static final String GET_ALL_USERS= "select userid,userpassword,status from users";
	public static final String GET_ALL_STUDENTS= "select id ,fname,lname,dob,area from students";
	public static final String INSERT_STUDENT_DATA= "INSERT into students values (?,?,?,?,?)";
}
