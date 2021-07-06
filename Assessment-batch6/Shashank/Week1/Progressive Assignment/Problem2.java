package Assignment;

import java.util.*;
public class Problem2 {
	public static void main(String[] args) {
		String qry = "select id , name , age  from employee, salary where id = 1";
		
		SQL query = new SQL();
		
		
		
		System.out.println("Tables::");
		String[] tables = query.getTables(qry);
		
		for(int i = 0;i<tables.length;i++) {
			System.out.println(tables[i]);
		}
		
		
		
		
		System.out.println("Conditions::");
		
		
		String qr1 = "select * from Employee where id=5 and Salary=100000";
		String[] conditions = query.get_Conditions(qr1);
		
		for(int i = 0;i<tables.length;i++) {
			System.out.println(conditions[i]);
		}
		
		
		System.out.println("Columns::");

		String qry2 = "select details.id, details.name, details.age, details.marks  from details, Smarks";
		Map<String, List<String>> map = query.getColumns(qry2);
		
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println();
		System.out.println("Subquery::");
		
		
		String qry3 = "select Name from Detais where id in (select marks from Smarks) and name in (select Age from Details)";
		
		List<String> list = query.getSubQuery(qry3);
		
		System.out.println(list);
	}

}
