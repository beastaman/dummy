package CalulationAssignment;

import java.util.*;

public class ArithmeticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int choice = sc.nextInt();
		FactoryPattern fp = new FactoryPattern(num1,num2,choice);
		sc.close();
		
	}

}
