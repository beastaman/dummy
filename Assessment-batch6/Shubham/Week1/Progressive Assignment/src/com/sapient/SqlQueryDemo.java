package com.sapient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SqlQueryDemo {

	public static void main(String[] args) {
		
		String arg= "SELECT NAME, ID, FROM EMPLOYEE WHERE NAME=\"SHUBHAM\", age>20";
		SqlQuery sq= new SqlQuery();
		String[] tables=sq.getTables(arg);
		String[] conditions=sq.getConditions(arg);
		
		
		List<String> tab=new ArrayList<>();
		tab=Arrays.asList(tables);
		List<String> con=new ArrayList<>();
		con=Arrays.asList(conditions);
		System.out.println(tab);
		System.out.println(con);
		
	}

}
