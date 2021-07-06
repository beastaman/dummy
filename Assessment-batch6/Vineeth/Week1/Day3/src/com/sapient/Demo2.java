package com.sapient;

public class Demo2 {

	public static void main(String[] args) {

		Add object = new Add();
		object.setData(10, 20);
		object.calculate();
		object.displayData();

		object = new Add(10);
		object.calculate();
		object.displayData();

		object = new Add(20, 30);
		object.calculate();
		object.displayData();

		System.gc();
	}
}
