package com.sapient.constants;

public class Constants {

	public static final String GET_ALL_BRANCH_QUERY = "select * from branch";
	
	public static final String GET_BRANCH_BY_ID_QUERY = "select * from branch where id=?";
	
	public static final String GET_TABLE_BY_ID_QUERY = "select * from tables where id=?";
	
	public static final String GET_USER_FROM_CREDENTIALS_QUERY = "select * from user where email=? and password=?";
	
	public static final String SAVE_USER_QUERY = "insert into user (email, password, fname, lname, phone) values (?,?,?,?,?)";
	
	public static final String GET_USER_BY_ID_QUERY = "select * from user where id=?";
	
	public static final String GET_RESERVATIONS_BY_BRANCH_AND_DATE_QUERY = "select * from (select * from tables where branchid=?) T left outer join (select * from reservation where starttime>=? and starttime<?) R on T.id=R.tableid;";
	
	public static final String SAVE_RESERVATION_QUERY = "insert into reservation (tableid, userid, starttime, duration) values (?,?,?,?)";

	public static final String GET_RESERVATION_BY_ID_QUERY = "select * from reservation where id=?";

	public static final String CHECK_VALID_RESERVATION_QUERY = "select * from reservation where tableId=? and (timestampadd(minute, 1, starttime) between ? and timestampadd(minute, ?, ?) or timestampadd(minute, duration-1, starttime) between ? and timestampadd(minute, ?, ?))";
	
	public static final String GET_RESERVATIONS_OF_USER_QUERY = "select r.id, r.userid, b.name, t.tableno, r.starttime, timestampadd(minute, r.duration, r.starttime), r.duration from reservation r, tables t, branch b where r.userid=? and r.tableid=t.id and t.branchid=b.id";
	
}
