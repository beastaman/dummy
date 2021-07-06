package com.sapient.utility;

public class Constant { 
	
	public Constant() {

	}

	public static final String GET_USER_DETAILS = "select * from ruser where email = ? and password = ?";
	public static final String GET_ALL_TABLES = "select * from rtable";
	public static final String GET_TABLE_PRICE_BY_ID = "select * from rtable where tid = ?";
	public static final String GET_ITEM_BY_ID = "select * from rfooditems where fid = ?";
	public static final String GET_ALL_FOOD_ITEMS = "select * from rfooditems";
	public static final String GET_ALL_BRANCHES = "select * from rbranch";

	
	public static final String INSERT_USER_TABLE =  "insert into ruserTable(uid, tid) values (?,?)";
	public static final String INSERT_INTO_USER_ITEMS = "insert into ruserItem(uid, fid, qty) values (?,?,?)";

}
