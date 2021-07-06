package com.sapient;

public class RunTimePoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=1,n2=2;
		Calc ob = new Add(n1,n2);
		System.out.println(ob.result());

		ob = new Sub(n1,n2);
		System.out.println(ob.result());
		
	}

}
