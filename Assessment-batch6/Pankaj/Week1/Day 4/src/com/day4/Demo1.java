package com.day4;

import java.util.*;

public class Demo1 {

    public static void main(String[] args) {
        //TODO
        //POJO (Plain Old Java Object) for transfer the objects
        //2nd type of object is buisness object

//        EmployeeDTO employee = new EmployeeDTO();
//        employee.setAge(22);
//        employee.setfName("Pankaj");
//        employee.setlName(".");
//        employee.setSalary(100000.0);
//        System.out.println(employee.getfName());
//        System.out.println(employee.getlName());
//        System.out.println(employee.getAge());
//        System.out.println(employee.getSalary());
//
//        System.out.println(employee);

//        EmployeeDTO employee1= new EmployeeDTO("Jatin", "Singh", 22, 100000.0);
//        System.out.println(employee1);
//        List<EmployeeDTO> employees = new ArrayList<>();
//        TaxCalculation taxCalculator = new TaxCalculation();
//        employees.add(new EmployeeDTO("Jatin", "Singh", 22, 20000.0));
//        employees.add(new EmployeeDTO("Sachin", ".", 21, 50000.0));
//        employees.add(new EmployeeDTO("Soumya", "Rathore", 23, 60000.0));
//        employees.add(new EmployeeDTO("Wasim", "Tyagi", 20, 70000.0));
//        employees.add(new EmployeeDTO("Shashank", "Verma", 24, 40000.0));
//        employees.forEach(e -> {
//            System.out.println(e);
//            System.out.println("Tax: "+taxCalculator.calculateTax(e));
//        });
//
//        String s = Read.scanner.nextLine();
//        System.out.println(Arrays.toString(s.split(" ")));
//
          //Query Processor
//        String query = "Select fName, lName, salary from t1, t2 where age=22 and t1.uid=t2.uid and salary<>10000";
//        System.out.println("Table Name: "+ query.split("from")[1].split("where")[0]);
//        System.out.println("Conditions: "+ query.split("where")[1].replace(" ","").replace("and", ", "));

        List<Integer> list = Arrays.asList(10,20,40,40,30,30,60,30);
        System.out.println(list);
        Set<Integer> set = new HashSet<>(Arrays.asList(10,20,30,40,20,10,40));
        System.out.println(set);
        Set<Integer> orderedSet = new LinkedHashSet<>(Arrays.asList(10,30,20,30,40,20,10,40));
        System.out.println(orderedSet);
        Set<Integer> sortedSet = new TreeSet<>(Arrays.asList(10,20,60,70,20,40,20,10,40));
        System.out.println(sortedSet);
        System.out.println(sortedSet.parallelStream().mapToInt(Integer::intValue).sum());

        Map<Integer,String> map = Map.of(10,"Pankaj", 40, "Sachin kamat",50, "Shashank", 20,"Jatin", 30, "Soumya");
        System.out.println("Map: "+map);

        Map<Integer,String> treemap = new TreeMap<>();
        treemap.put(10,"Pankaj");
        treemap.put(40, "Sachin kamat");
        treemap.put(50, "Shashank");
        treemap.put(20,"Jatin");
        treemap.put(30, "Soumya");
        System.out.println("Sorted Key Based Map: "+treemap);

        Map<Integer,String> orderedMap = new LinkedHashMap<>();
        orderedMap.put(10,"Pankaj");
        orderedMap.put(40, "Sachin kamat");
        orderedMap.put(50, "Shashank");
        orderedMap.put(20,"Jatin");
        orderedMap.put(30, "Soumya");
        System.out.println("Ordered Map: "+orderedMap);

        Queue<Integer> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(10,30,20,50,40,60));
        System.out.println("Queue: "+queue);
        System.out.println("First Value removed in Queue: "+queue.remove());
        queue.add(80);
        System.out.println("After adding 10 to Queue: "+queue);

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addAll(Arrays.asList(10,30,20,50,40,60));
        System.out.println("Deque: "+deque);
        System.out.println("Remove from starting in deque: "+deque.pollFirst());
        System.out.println("Remove from last in deque: "+deque.pollLast());
        System.out.println("Getting from starting in deque: "+deque.getFirst());
        System.out.println("Getting from last in deque: "+deque.getLast());
        System.out.println("After operations Deque: "+deque);
    }
}
