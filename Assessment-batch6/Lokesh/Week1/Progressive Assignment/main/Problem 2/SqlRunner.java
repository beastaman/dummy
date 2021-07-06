package com.week1.Problem2;
import java.util.*;

public class SqlRunner {

	public static void main(String[] args) {
		String qry = "select ID, Name, Age, Marks from Details, Smarks where ID = 1";
		
		SqlQuery query = new SqlQuery();
		
		System.out.println();
		System.out.println("Showing the tables name--------");
		String[] tables = query.getTables(qry);
		
		for(int i = 0;i<tables.length;i++) {
			System.out.println(tables[i]);
		}
		
		System.out.println();
		System.out.println("Showing the sql condition-------");
		
		
		String qr1 = "select * from Customers where Country='Germany' and City='Berlin'";
		String[] conditions = query.get_Conditions(qr1);
		
		for(int i = 0;i<tables.length;i++) {
			System.out.println(conditions[i]);
		}
		
		System.out.println();
		System.out.println("Showing all columns name-------");

		String qry2 = "select details.id, details.name, details.age, details.marks  from details, Smarks";
		Map<String, List<String>> map = query.getColumns(qry2);
		
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println();
		System.out.println("Showing all Subqueries---------");
		
		
		String qry3 = "select Name from Detais where id in (select marks from Smarks) and name in (select Age from Details)";
		
		List<String> list = query.getSubQuery(qry3);
		
		System.out.println(list);
	}
}
