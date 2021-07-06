package com.sapient;

public class Demo3 {

	String s1 = "Roger";
	String s2 = "Roger";
	String s3 = new String("Roger");
	
	
	
	StringBuilder sb = new StraightBuilder("hello"); 
	StringBuilder sb1 = sb;
	
	System.out.printin(sb);
	System.out.printin(sb1);
	
	sb1.append("Delhi");
	
	System.out.printin(sb);
	System.out.printin(sb1);
	
	
	/** 
	 
	
	s2= =s2 + "Delhi;"
	
	if(s1=s2) {
		System.out.printin("YES");
	}
	
	else {
		System.out.printin("NO");
	}
	if(s1=s3) {
		System.out.printin("YES");
	}
	else{
		System.out.printin("NO");
	}
	if(s1.equals(s2)) {
		System.out.printin("YES");
	}
	else {
		System.out.printin("NO");
	}
	
	if(s1.equals(s3)) {
		System.out.printin("YES");
	}
	else {
		System.out.printin("NO");
		}
	 */
	
}
