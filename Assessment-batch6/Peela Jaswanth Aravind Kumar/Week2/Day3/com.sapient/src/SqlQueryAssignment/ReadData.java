package SqlQueryAssignment;


import java.util.*;
import java.io.*;

//import org.graalvm.compiler.replacements.nodes.arithmetic.IntegerAddExactNode;

public class ReadData {
	
//	private static bool ComputeCondition(string value) {
//		
//		using (DataTable dt = new DataTable()) {
//	    return (bool)(dt.Compute(value, null));
//	  }
//	}
	
	public List<String> getData(String q) throws Exception{
		SqlQuery obj = new SqlQuery();
		String[] conds = obj.getConditions(q);
		Map<String,List> cols = obj.getColumns(q);
		
//		try {
//			Scanner det = new Scanner(new File("C:\\Users\\Jaswanth\\eclipse-workspace\\com.sapient\\src\\SqlQueryAssignment\\Details.csv"));
//			det.useDelimiter(",");
//			while(det.hasNext()) {
//				System.out.println(sc.next());
//			}
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		int ID,age;
		String line = new String("");
		String Name = new String("");
		String city = new String("");
		List<String>ans = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Jaswanth\\eclipse-workspace\\com.sapient\\src\\SqlQueryAssignment\\Details.csv"));
			while((line = br.readLine()) != null) {
				String[] rows = line.split(",");
//				for(String s: rows) {
//					System.out.println(s);
//				}
				ID = Integer.parseInt(rows[0]); Name = rows[1];
				age = Integer.parseInt(rows[2]); city = rows[3];
				
				Map<String,Integer>m1 = new HashMap();
				Map<String,String>m2 = new HashMap();
				m1.put("age", age);
				m1.put("ID", ID);
				m2.put("Name", Name);
				m2.put("city", city);
				
				Map<String,Integer> index = new HashMap();
				index.put("ID", 0);
				index.put("Name", 1);
				index.put("age", 2);
				index.put("city", 3);
//				System.out.println(age);
				int check = 1;
 				for(int i=0;i<conds.length;i++) {
					String str = conds[i];	
					
					if(str.contains("==")) {
						String sp[] = str.split("==");
						sp[0] = sp[0].trim();
						if(m1.containsKey(sp[0]) && m1.get(sp[0]) != Integer.parseInt(sp[1].trim())) {
							check = 0;
						}
						if(m2.containsKey(sp[0]) && m2.get(sp[0]) != sp[1].trim()) {
							check = 0;
						}
					}
//					if(str.contains("!=")) {
//						String sp[] = str.split("!=");
//						if(Integer.parseInt(sp[0]) == Integer.parseInt(sp[1])) {
//							check = 0;
//						}
//					}
//					if(str.contains("<")) {
//						
//						if(str.contains("<=")) {
//							String sp[] = str.split("<=");
//							if(Integer.parseInt(sp[0]) > Integer.parseInt(sp[1])) {
//								check = 0;
//							}
//						}
//						else {
//							String sp[] = str.split("<");
//							if(Integer.parseInt(sp[0]) >= Integer.parseInt(sp[1])) {
//								check = 0;
//							}
//						
//					}
 				
//						
//					}
//					if(str.contains(">")) {
//						if(str.contains(">=")) {
//							String sp[] = str.split(">=");
//							if(Integer.parseInt(sp[0]) < Integer.parseInt(sp[1])) {
//								check = 0;
//							}
//						}
//						else {
//							String sp[] = str.split(">");
//							if(Integer.parseInt(sp[0]) <= Integer.parseInt(sp[1])) {
//								check = 0;
//							}
//						}
//						
//					}
				}
 				if(check == 1) {
 					
// 					String columns[] = line.split(",");
// 					
// 					String str = new String("");
// 					List output = cols.get("Details");
// 					
// 					for(int i=0;i<output.size();i++) {
// 						System.out.println(output.get(i));
// 						int ind = index.get(output.get(i));
// 						str += (columns[ind]+" ");
// 					}
 				
// 					System.out.println(str);
 					
					ans.add(line);
					
				}
				
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return ans;
		
		
		
	}
}

