package com.company;
import java.util.Scanner;

public class App{
	
    public static void main(String[] args)
    {
		CheckEven checkEven = new CheckEven();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(!checkEven.check(num))
			System.out.println("Even");
		else System.out.println("Odd");
    }
}
