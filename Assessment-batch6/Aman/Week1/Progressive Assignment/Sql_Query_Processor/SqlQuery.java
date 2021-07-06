package Sql_Query_Processor;

import java.util.*;

public class SqlQuery {
	public static String[] getTabels(String query) {
		String arr[] = query.split("FROM ");
		String arr1[] = arr[1].split(" WHERE");
		String arr2[]=arr1[0].split(",");
		for(String x:arr2) System.out.println(x);
		return arr2;
	}
	public static String[] getConditions(String query) {
		String arr1[] = query.split(" WHERE ");
		String arr2[]=arr1[1].split("( AND | OR )");
		for(String x:arr2) System.out.println(x);
		return arr2;
	}
	public static String[] getCollums(String query){
		Map<String, List<String>> mp  = new HashMap<>();
		String arr[] = query.split(" FROM ");
		String arr1[]=arr[0].split("SELECT ");
		String cols[]=arr1[1].split(","); // columns
		for(String x:cols) System.out.println(x);
		//String tables[]=SqlQuerySingleton.getSqlQuery().getTabels(query);
		return cols;
	}
	public List<String> getSubQuery(String query){
		List<String> subqueries = new ArrayList<>();
		String[] temp = query.split("[(]");
		int f=0;
		for(String x:temp) {
			if(f==0) {
				f=1;
				continue;
			}
			subqueries.add(x.split("[)]")[0]);
		}
		return subqueries;
	}
	public static void main(String[] args) {
		String query="SELECT column1,column2"+ " FROM table_name1,table_name2 "+ "WHERE condition1 AND condition2 OR condition3";
		getTabels(query);
		getConditions(query);
		getCollums(query);
	}
}
