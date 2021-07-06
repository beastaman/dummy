package SqlQueryAssignment;

import java.util.ArrayList;

import javax.xml.transform.Templates;

import java.util.*;

public class SqlQuery {
	
	public static String[] GetStringArray(ArrayList<String> arr){
		
        String str[] = new String[arr.size()];
        
        for (int j = 0; j < arr.size(); j++) {
              str[j] = arr.get(j);
        }
  
        return str;
    }
	
	public String[] getTables(String query) {
		
		String arr1[] = query.split("from");
		
		String tablesQ[] = arr1[1].split("where");
		
		String tables[] = tablesQ[0].split(",");
		
		ArrayList<String> res = new ArrayList<String>();
		
		for(String s: tables) {
			String temp[] = s.trim().split(" ");
			res.add(temp[0]);
		}

		return GetStringArray(res);
		
	}
	
	public String[] getConditions(String query) {
		
		String arr1[] = query.split("from");
		
		String tablesQ[] = arr1[1].split("where");
		
		String conds[] = tablesQ[1].split("and");
		
		for(String s:conds) {
			s.trim();
		}
		return conds;
	}
	
	public Map<String,List>getColumns(String query){
		
		String arr1[] = query.split("from");
		
		String tablesQ[] = arr1[0].split(" ");
		
		String Tablecols[] = tablesQ[1].split(",");
		
		String alias[] = arr1[1].split("where");
		
		alias = alias[0].split(",");
		
		Map<String,String>mp = new HashMap<String,String>();
		
		ArrayList<String> res = new ArrayList<String>();
		
		for(String s: alias) {
			String temp[] = s.trim().split(" ");
			
			if(temp.length == 2) {
				mp.put(temp[1], temp[0]);
			}
			else {
				mp.put(temp[0],temp[0]);
			}
		}
		
		
//		for(String b:Tablecols) {
//			System.out.println(b);
//		}
//		System.out.println("a,salary".split(",")[1]);
		Map<String, List> ans = new HashMap<String, List>();
		for(String s:Tablecols) {
			
			String t1 = new String("");
			String t2 = t1;
			int check = 0;
			
			for(int i=0;i< s.length();i++) {
				if(s.charAt(i) == '.') {
					check = 1;
					continue;
				}
				if(check == 0)t1+=s.charAt(i);
				else t2+=s.charAt(i);
			}
			if(ans.containsKey(mp.get(t1))) {
				if(t2 != "") {
					ans.get(mp.get(t1)).add(t2);
				}
				else {
					String tables[] = getTables(query);
					ans.get(tables[0]).add(t1);
				}
//				System.out.println(ans.get(mp.get(t1)));
			}
			else {
				
				if(t2 != "") {
					ans.put(mp.get(t1),new ArrayList<String>());
					ans.get(mp.get(t1)).add(t2);
				}
				else {
					String tables[] = getTables(query);
					ans.put(tables[0],new ArrayList<String>());
					ans.get(tables[0]).add(t1);
				}
			}
//			System.out.println(ans.containsKey("Details"));
		}
		return ans;
	}
//	
//	public List<String> getSubQuer(String query){
//		
//	}
}
