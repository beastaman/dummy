package com.sapient.hashing;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! Welcome to java-maven project!!" );
		System.out.println( new App().add(4,5));
    }
	public int add(int a , int b){
		return a+b;
	}
}
