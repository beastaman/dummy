package com.sapient;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
	System.out.println( new App().multiply(30,50) );
    }
    public int multiply (int x,int y)
	{
		return x*y;
	}
}
