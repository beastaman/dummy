package SqlQueryAssignment;
import java.util.*;

public class sqlMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String query = "select a.fname,a.age,b.fname,b.salary from table1 a,table2 b where age==2";
		SqlQuery q = new SqlQuery();
		System.out.println("tables: ");
		String tables[] = q.getTables(query);
		for(String s: tables) {
			System.out.println(s);
		}
		System.out.println("\nconditions: ");
		String conds[] = q.getConditions(query);
		for(String s: conds) {
			s = s.trim();
			System.out.println(s);
		}
		System.out.println("\ncolumns: ");
		Map<String,List> cols = q.getColumns(query);
		
		for(String key:cols.keySet()) {			
			
			System.out.print(key + ": ");
			List<String> s = cols.get(key);
			for(String str:s) {
				System.out.print(str + " ");
			}
			System.out.println();
		}
		
		ReadData rd = new ReadData();
		List<String>output = rd.getData("select ID,Name,age,city from Details where age==23");
		System.out.println("\noutput for the query");
		for(String s:output) {
			System.out.println(s);
		}
		
//		System.out.println(q.getTables(query));
//		System.out.println(q.getColumns(query));
//		System.out.println(q.getConditions(query));
	}

}
