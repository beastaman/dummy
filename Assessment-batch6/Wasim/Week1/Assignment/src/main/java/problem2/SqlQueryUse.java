package main.java.problem2;

import java.util.*;

public class SqlQueryUse {

	public static void main(String[] args) {

		String query = "Select * from table1, table2, table3 where table1.uid = tabl2.uid AND table1.uid = tabl3.uid";

		SqlQuery sqlQuery = FactoryClassSQL.getFactory();

		String [] tables = sqlQuery.getTables(query);
		
		System.out.println(Arrays.toString(tables));
		
		System.out.println("-----------------");
		
		String [] conditions = sqlQuery.get_Conditions(query);
		
		System.out.println(Arrays.toString(conditions));
		
		System.out.println("-----------------");

		String query1 = "select table1.uid, table1.name, table2.age  from table1, table2";

		Map<String , List<String>> map = FactoryClassSQL.getFactory().getColumns(query1);
		
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println("-----------------");

		
		String query2 = "select uid from table1 where name in (select id from table2) and name in (select name from table1)";
		
		List<String> list = FactoryClassSQL.getFactory().getSubQuery(query2);
		
		System.out.println(list);
		
		
	}

}
