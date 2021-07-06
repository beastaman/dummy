package com.dayfour;

public class Demo2 {

	public static void main(String[] args) {
		String query="select age, firstName, lastName, salary from employee , stu where age=23";
		String words[]=query.split(" ");
		for(String s: words)
			System.out.println(s);
		String words1[]=query.split(" from ");
		for(String s: words1)
			System.out.println(s);
		String words2[]=words1[0].split(" ");
		for(int i=1;i<words2.length;++i)
			System.out.println(words2[i]);
		String words3[]=words1[1].split(" where ");
		for(String s: words3)
			System.out.println(s);
	}

}
