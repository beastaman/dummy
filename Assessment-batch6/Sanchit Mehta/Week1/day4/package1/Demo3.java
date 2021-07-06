package com.package1;

interface Employee{
	public int calculateTax();
}

class EmployeeImplements implements Employee{
	@Override
	public int calculateTax() {
		return 10;
	}
}
public class Demo3 {

	public static void main(String[] args) {
		//Collections
		//Framework in Java
		//made up of interfaces, classes and algorithms
		//Eg:- 
//		List --> duplicates, ordered [ArrayList, Vectors, LinkedList]  sync/async
//		Set  --> no duplicates, [hashset, treeset, linked hashset]
//		Queue --> FIFO [linkedlist]
//		Dequeue --> LIFO + FIFO [linkedlist]
		
		//Eg:- Map [hashmap, treemap, linked hashmap]
		
		Employee emp=new EmployeeImplements();
		System.out.println(emp.calculateTax());
		
		
	}

}
