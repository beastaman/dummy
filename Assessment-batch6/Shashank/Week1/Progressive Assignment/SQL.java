package Assignment;


import java.util.*;

public class SQL {

	public String[] getTables(String arg) {
		
		
		String[] ar1 = arg.split("from");
		String[] ar2 = ar1[1].split("where");
		String ar3 = ar2[0].trim().replaceAll(",","");
		
		String[] tables = ar3.split(" ");
		
		return tables;
	}

	public String[] get_Conditions(String arg) {
		String[] ar1  = arg.split("where");
		
		String[] ar2 = ar1[1].split("and");
		return ar2;
	}

	public Map<String, List<String>> getColumns(String arg) {
		
		Map<String, List<String>> m = new HashMap<>();

		String[] str = ((arg.split("select")[1]).split("from")[0]).split("[,]");

		for (int i = 0; i < str.length; ++i) {

			String[] array2 = (str[i].split(" ")[1]).split("[.]");
			if (m.containsKey(array2[0])) {
				m.get(array2[0]).add(array2[1]);
			}
			else {
				m.put(array2[0], new ArrayList<String>(List.of(array2[1])));
			}
		}
		return m;
	}

	public List<String> getSubQuery(String arg) {
		List<String> list = new ArrayList<>();
		arg = arg.toLowerCase();
		String[] str = arg.split("[(]");
		for (int i = 1; i < str.length; ++i) {
			String temp = str[i].split("[)]")[0];
			list.add(temp);
		}
		return list;
	}

	
}