package com.sapient.week1;

/**
 * Hello world!
 *
 */

public class App 
{
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
	CheckEven obj = new CheckEven();
	boolean answer = obj.check(4);
	
	if(answer == true)
	{
		System.out.println( "Number is Even!" );
	}
	else{
		System.out.println( "Number is NOT Even!" );
	}
    }
}
