package com.package2;

public class exceptionHandling {
	
	public static void f1(int a,int b) throws ArithmeticException{
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0;
		
		try {
			f1(a,b);
//			int c=a/b;
//			System.out.println(c);
		} 
		catch(ArithmeticException e) {
			System.out.println("division by zero");
			
		}catch (Exception e) {
		
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("ends");

	}

}
