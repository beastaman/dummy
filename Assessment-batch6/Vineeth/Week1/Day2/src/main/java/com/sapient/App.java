package com.sapient;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!\nWelcome to Maven Project!\n" );
		System.out.println("Add(2,5) : " + add(2, 5));
    }
	
	public static int add(int a, int b) {
		return a+b;
	}
}
