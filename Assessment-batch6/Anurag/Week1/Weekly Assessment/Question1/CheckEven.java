package com.sapient.week1;
import java.util.*;

class CheckEven {
	public static boolean checking(int num) {
		if ( num % 2 == 0 )
	     return true;
	    return false; 
	}

	public static void main(String[] args) {
		int num;
	    
		System.out.println("Enter an Integer number:");
		   
		 Scanner input = new Scanner(System.in);
		   
		 num = input.nextInt();
		 boolean b=checking(num);
		 System.out.println(b);
		 input.close();

		  

	}

}
