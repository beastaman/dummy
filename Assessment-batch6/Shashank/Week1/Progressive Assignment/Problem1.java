package Assignment;
import java.util.*;


public class Problem1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int a =  scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Enter choice for arithmetic calculation + , - , * ,\\ ");
		
		Arithmetic obj[] = new Arithmetic[4];
		int ch = scan.nextInt();
		obj[0] = new Addition(a,b);
		obj[1] = new Division(a,b);
		obj[2] = new Multiplication(a,b);
		obj[3] = new Division(a,b);
		
		obj[ch-1].calculate();
		obj[ch-1].display();
		
		
		
		
		
		

	}

}
