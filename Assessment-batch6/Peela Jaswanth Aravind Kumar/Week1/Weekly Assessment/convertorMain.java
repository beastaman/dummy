package Week1Exam;

import java.util.*;

public class convertorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("choose source and target among America,Japan,UK,India");
		String source = sc.next();
		String target = sc.next();
		System.out.println("enter the amount to be converted.");
		Double amount = sc.nextDouble();
	
		convertor con = new convertor();
		
		System.out.println(con.convert(source, target, amount));

	}

}
