package com.constant;

public class Constants {

	public static final String GET_ALL_STUDENT_QUERY = "select * from student";
	public static final String GET_ALL_BRANCH_QUERY="select * from branch";
	public static final String GET_TABLE_WITH_BRANCH_QUERY="select *from table where branch=?";
	public static final String SAVE_STUDENT = "insert into student values (?,?,?,?,?)";
	public static final String GET_ORDER_ID="select* from booking where branchid=?&&where tableid=?&&where userid=?&&where time=?";
	public static final String GET_BOOKING_WITH_TIME_T1="select *from booking where time=?&&tableid='t1'";
	public static final String GET_BOOKING_WITH_TIME_T2="select *from booking where time=?&&tableid='t2'";
	public static final String GET_BOOKING_WITH_TIME_T3="select *from booking where time=?&&tableid='t3'";
	
}