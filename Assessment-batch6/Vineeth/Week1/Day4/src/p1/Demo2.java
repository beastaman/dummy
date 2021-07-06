package p1;

public class Demo2 {

	public static void main(String[] args) {
		
		// SELECT COLUMNS
		// FROM TABLES
		// WHERE CONDITION
		// GROUP BY COLUMNS
		// HAVING CONDITION
		// ORDER BY COLUMNS
		
		String query = "select E.fname, age, salary from Employee E where age>20";
		String[] words = query.split(" ");
		int i;

		System.out.println("Words present in Query :");
		for (String w : words) System.out.println(w);
		
		System.out.println("\nColumns present in Query :");
		for (i=1;!words[i].equalsIgnoreCase("from");i++)
			System.out.println(words[i].replaceAll("[^a-zA-Z0-9_\\.]", ""));
		
		parseQuery(query);		
	}
	
	public static void parseQuery(String query) {
		
		query = query.toUpperCase();
		String[] q = query.split("SELECT");
		
		q = q[1].split("FROM");
		String[] columns = q[0].trim().replace(",", " ").split("\s+");
		System.out.println("\nColumns present in Query :");
		for (String c : columns) System.out.println(c);
		
		q = q[1].split("WHERE");
		String[] tables = q[0].trim().split(",");
		System.out.println("\nTables present in Query :");
		for (String t : tables) System.out.println(t);
		
		q = q[1].split("GROUP BY");
		String conditions = q[0].trim().replace(",", " ");
		System.out.println("\nConditions present in Query :");
//		for (String c : conditions) 
		System.out.println(conditions);
	}
}
