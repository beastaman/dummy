package com.constants;

public class Constants {

	public static final String GetUserFromEmailAndPassword = "select * from user where username = ? And password = ?";
	public static final String GetAllFromBranches = "select * from branches";
	public static final String getAllTableUnreservedBranch = "select tableid from `table` where isAvailable = 1 And branchid = ? ";
	public static final String GetAllItemsInTheBranch = "select itemname from item where branchid=?";
}
