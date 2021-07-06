package com.sapient.utils;

public class Constants {
    public final static String FIND_CUSTOMER="select * from ruser where email=? and password=?";
    public final static String FIND_ALL_BRANCHES="select * from rbranch";
    public final static String FIND_TABLE_BY_ID="select * from rtable where tid=?";
    public final static String FIND_ALL_TABLES_IN_BRANCH="select * from rtable where bid=?";
    public final static String FIND_FOODITEM_BY_ID="select * from rfooditems where fid=?";
    public final static String FIND_ALL_FOODITEM="select * from rfooditems";
    public final static String INSERT_CUSTOMER_TABLE_MAPPING="insert into ruserTable values(?,?)";
    public final static String INSERT_CUSTOMER_ORDER_MAPPING="insert into ruserOrder(uid, fid, qty) values(?,?,?)";
    public final static String FIND_ORDER_USER_MAPPING_BY_USER_ID="select * from ruserOrder where uid = ?";
    public final static String FIND_ORDER_TABLE_MAPPING_BY_USER_ID="select * from ruserTable where uid = ?";
    public final static String FIND_USERID_BY_USEREMAIL="select uid from ruser where email=?";
}
