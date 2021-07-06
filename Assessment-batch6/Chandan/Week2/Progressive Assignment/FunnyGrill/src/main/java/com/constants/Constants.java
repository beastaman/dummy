package com.constants;

public class Constants {

	public static final String ALL_BRANCHES = "select b.id, b.area, b.tables, b.ph_no, p.city, p.state "
			+ "from branchdetails b " + "inner join "
			+ "(select c.id, c.name city, s.name state from city c inner join state s on c.state_id=s.id) p "
			+ "on b.city_id = p.id;";

	public static final String GET_BRANCH = "select b.id, b.area, b.tables, b.ph_no, p.city, p.state "
			+ "from branchdetails b " + "inner join "
			+ "(select c.id, c.name city, s.name state from city c inner join state s on c.state_id=s.id) p "
			+ "on b.city_id = p.id " + "where b.id = ?";

	public static final String GET_CUSTOMER = "select * from customerdetails "
			+ "where binary email = ? and binary password=?";

	public static final String SAVE_CUSTOMER = "insert into CustomerDetails "
			+ "(email, password, fname, lname, ph_no, status) values " + "(?, ?, ?, ?, ?, ?);";

	public static final String BRANCH_FOOD = "select * from fooditem f "
			+ "where f.id in (select food_id from branchfood where branch_id = ?);";

	public static final String GET_FOOD_ITEM = "select * from fooditem where id = ?";

	public static final String GET_TIME_SLOT = "select * from timeslots where id = ?";
	public static final String GET_TIME_SLOTS = "select * from timeslots";

	public static final String PLACE_PARCEL = "insert into parcelorder " + "(customer_id, branch_id, status) values "
			+ "(?, ?, ?)";

	public static final String BOOK_TABLE = "insert into tablereserve "
			+ "(customer_id, branch_id, slot_id, status, reservedate) values " + "(?, ?, ?, ?, ?)";

	public static final String RECENT_TABLES_CUST = "select * from tablereserve where "
			+ "customer_id=? and created_at>DATE_SUB(CURDATE(), INTERVAL 1 MONTH)";

	public static final String RECENT_PARCEL_CUST = "select * from parcelorder where "
			+ "customer_id=? and created_at>DATE_SUB(CURDATE(), INTERVAL 1 WEEK)";

	public static final String PARCEL_ORDER_DET = "select f.name, f.price, p.qty from parcelfood p "
			+ "inner join fooditem f on p.food_id=f.id where p.parcel_id=?";

}
