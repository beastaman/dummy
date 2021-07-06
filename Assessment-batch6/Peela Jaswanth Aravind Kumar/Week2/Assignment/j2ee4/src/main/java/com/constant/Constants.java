  
package com.constant;

public class Constants {

	public static final String GET_ALL_STUDENT_QUERY = "select * from student";
	public static final String SAVE_STUDENT = "insert into student values (?,?,?,?,?,?)";
	public static final String GET_ORDERSOF_BRANCHID = "select * from tb where branchId = ?";
	public static final String ADD_ORDERTO_BRANCHID = "insert into table values (NULL,?,?,?,?,?)";
	public static final String ADD_USER = "insert into user values (?,?,?)";
}