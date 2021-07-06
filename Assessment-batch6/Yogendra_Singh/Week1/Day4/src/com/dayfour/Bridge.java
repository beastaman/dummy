package com.dayfour;

interface b1 {
	void f1();
}

interface b2 {
	void f2();
}


interface b3 {
	void f3();
}

public interface Bridge extends b1,b2 {
	
}

class Actual implements Bridge {

	@Override
	public void f1() {
		System.out.println("I am in f1 !!");
		
	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		System.out.println("I am in f2 !!");
		
	}
	
}