package p1;
import java.util.*;

import com.sapient.Read;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, EmployeeTO> map = new HashMap<>();
		map.put("vikas", new EmployeeTO(22,"vikas","malinda", 99000));
		map.put("vik", new EmployeeTO(24,"vik","malinda", 97000));
		map.put("vik.", new EmployeeTO(21,"vik.","malinda", 95000));
		map.put("vikash", new EmployeeTO(23,"vikash","malinda", 93000));
		
		System.out.println("Enter a employee name");
		
		try {
			String input = Read.scanner.next();
			System.out.println(map.get(input));
			
		} catch (Exception e) {
			System.out.println("catch part executed");
		}
	}

}
