package com.sachinweek1assignment;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SqlQuery implements SqlInterface {
	public static String[] getTables(String sql) {
		sql = sql.toUpperCase();
		// Splitting the String from "from" clause;
		String[] splitFrom = sql.split("FROM");

		// Table name should be in the 2nd half of split
		String temp1 = splitFrom[1];

		// Splitting the string from where clause
		String[] splitFromWhere = temp1.split("WHERE");

		// Table name should be present in first part of split
		String temp2 = splitFromWhere[0];

		// Splitting the string from "as" clause
		String[] tableName = temp2.split(" AS ");

		return tableName;
	}

	public static String[] getConditions(String sql) {
		sql = sql.toUpperCase();

		// Splitting the String from "from" clause;
		String[] splitFromWhere = sql.split("WHERE");

		// Table name should be in the 2nd half of split
		String temp1 = splitFromWhere[1];

		// Replacing Logical Operator OR and NOT with AND and the splitting acroos AND.
		String[] splitFromLogicalOperator = temp1.replaceAll("OR", "AND").replaceAll("NOT", "AND").split("AND");

		return splitFromLogicalOperator;
	}

	public static List<String> getSubQuery(String sql) {
		sql = sql.toUpperCase();

		// Splitting the String from "Select" clause;
		String[] splitFromSelect = sql.split("SELECT");

		// Converting String to list
		List<String> columnsNameList = Arrays.stream(splitFromSelect).collect(Collectors.toList());


		// Adding select Statement in subquery
		for (int i=0; i<columnsNameList.size();i++)
			columnsNameList.set(i, "SELECT" + columnsNameList.get(i));

		return columnsNameList;
	}
}