package com.sapient;

public class integerToString {
	int num;
	String S;
	
	integerToString(){
		num=0;
		S="0";
	}
	integerToString(int num){
		this.num=num;
	}
	public String setString() {
		this.S=Integer.toString(num);
		return this.S;
	}
}
