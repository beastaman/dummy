package com.week1.day4.designPattern;

public class AdapterUse  {

	public static void main(String[] args) {

		AdapterInterface adapterInterface = new Actual();
		
		adapterInterface.f1();
		adapterInterface.f2();
		
	}

}
