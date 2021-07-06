package p1;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {

	public static void main(String[] args) {
		
		Map<String, EmployeeTO> map = new HashMap<>();
		map.put("Emp 1" , new EmployeeTO("Emp", "1", 21, 10000));
		map.put("Emp 2" , new EmployeeTO("Emp", "2", 22, 20000));
		map.put("Emp 3" , new EmployeeTO("Emp", "3", 23, 30000));
		map.put("Emp 4" , new EmployeeTO("Emp", "4", 24, 40000));
		
		try {
			String name;
			name = "Emp 2";
			System.out.println(name + " : " + map.get(name));
			name = "Emp";
			System.out.println(name + " : " + map.get(name));
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
}
