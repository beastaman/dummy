package p1;

public class DesignPatternsDemo {
	
//	MVC
//	GoF
//	SOLID
//	MicroServices
//	
//	GoF (Gang of Four) : Creational Patterns, Structural Patterns and Behavioural Patterns
//	
//		Creational Patterns
//			Factory Method
//			Abstract Factory
//			Builder Pattern
//			Singleton Pattern
//		
//		Structural Patterns
//			Adapter
//			Bridge
//			Flyweight
//			Proxy
//			
//		Behavioural Patterns
//			Command
//			Chain of Responsibility
	
	public static void main(String[] args) {

		ArithmeticOperation op;
		int c, a, b;
		
		System.out.print("\nEnter choice : ");
		c = Read.scanner.nextInt();

		System.out.print("\nEnter two numbers : ");
		a = Read.scanner.nextInt();
		b = Read.scanner.nextInt();
		
		op = ArithmeticOperationFactory.getArithmeticOperation(c, a, b);
		op.calculate();
		op.displayData();
	}
}
