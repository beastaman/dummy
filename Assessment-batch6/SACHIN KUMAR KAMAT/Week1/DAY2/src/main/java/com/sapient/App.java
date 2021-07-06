package com.sapient;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! this is first maven project" );
        System.out.println(new App().add(3,2));
    }
    public int add(int a, int b){
	return a+b;
    }
}
