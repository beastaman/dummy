package com.sapient.utils;

public class Constant {

	public static final String USER_INFO = "select * from ruser where email = ? and password = ?";
	public static final String ALL_BRANCH = "select * from rbranch";
	public static final String INSERT_USER = "insert into ruser values(?,?,?,?,?)";

}
