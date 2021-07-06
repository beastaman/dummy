package com.sapient;


public class Demo1 {
	public void add()
	{
//		Scanner sc=new Scanner(System.in);
		AdditionOfTwoNumbers ob= new AdditionOfTwoNumbers();
		int  n1=Read.sc.nextInt();
		int  n2=Read.sc.nextInt();
		ob.setData(n1, n2);
		System.out.println(ob.getSum());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 ob=new Demo1();
		ob.add();
		System.out.println("Welcome to Java Project");
	}

}
