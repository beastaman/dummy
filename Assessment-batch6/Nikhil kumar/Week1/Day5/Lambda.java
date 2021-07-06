package com.sapient.day5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Lambda {
    public void fun1(int a, int b, Calculator cal) {
        System.out.println(cal.calculate(a,b));
    }

    public static void main(String[] args) {

        Calculator calculator = (a,b) -> a*b;
        System.out.println(calculator.calculate(10,20));

        new Lambda().fun1(10,30,calculator);



        Consumer<EmployeeDTO> consumer = (a) -> System.out.println(a);
        List<EmployeeDTO> employees = Arrays.asList(
                new EmployeeDTO(1,"Nikhil", 20), new EmployeeDTO(4,"Jatin", 21),
                new EmployeeDTO(5,"Saurav", 23), new EmployeeDTO(6,"Wasim", 22),
                new EmployeeDTO(2,"Pranav", 25), new EmployeeDTO(3,"Aniket", 24));
        Collections.sort(employees, (a,b) -> a.getName().compareTo(b.getName()));
        employees.forEach(System.out::println);
        employees.forEach(consumer::accept);

        //Total Age
        System.out.println(employees.stream().mapToInt(EmployeeDTO::getAge).sum());

        //Average Age
        System.out.println(employees.stream().mapToDouble(EmployeeDTO::getAge).average().orElse(-1));

        //Parallel Stream
        System.out.println(employees.parallelStream().mapToDouble(EmployeeDTO::getAge).average().orElse(-1));

        List<String> empINames = employees.stream().map(EmployeeDTO::getName).collect(Collectors.toList());
        System.out.println(empINames);


    }
}
