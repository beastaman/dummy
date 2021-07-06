package assignment.sapient.week1.q1;

import java.util.Scanner;
import java.util.function.Supplier;

import assignment.sapient.week1.q1.logic.ArithmeticRunner;
import assignment.sapient.week1.q1.logic.DivideByZeroException;

public class Ques1 {

	public static void main(String[] args) {
		
		Supplier<Scanner> reader = () -> {return new Scanner(System.in);};
		
		
		try(Scanner scanner = reader.get();){
			
			System.out.println("Enter 2 numbers (space seperated)");
			var num1 = scanner.nextInt();
			var num2 = scanner.nextInt();
			
			System.out.println("1.Add\t2.Sub\t3.Mul\t4.Div");
			var ch = scanner.nextInt();
			
			ArithmeticRunner.calculate(num1, num2, ch);
			
		}
		catch(DivideByZeroException dz) {
			System.out.println(dz.getMessage());
		}
		catch (Exception e) {
			System.out.println("Some Error Occured");
		}
		
	}

}
