package p1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTutorial {
    public static void main(String[] args) {
        Map<String, EmployeeTo> map = new HashMap<>();
        map.put("John", new EmployeeTo("John", "wick", 40, 1000));
        map.put("John1", new EmployeeTo("John1", "wick", 40, 1000));
        map.put("John2", new EmployeeTo("John3", "wick", 40, 1000));
        map.put("John3", new EmployeeTo("John3", "wick", 40, 1000));

        System.out.println("Enter name ");

        Scanner sc = new Scanner(System.in);
        try {
            String s1 = sc.next();
            System.out.println(map.get(s1));
        } catch (Exception e) {
            System.out.println("Employee doesn't exist");
        }
    }
}
