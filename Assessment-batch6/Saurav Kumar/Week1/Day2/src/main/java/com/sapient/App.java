package com.sapient;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to maven " + new App().add(2, 3));
    }

	public int add(int a, int b) {
		return a+b;
	}
}
