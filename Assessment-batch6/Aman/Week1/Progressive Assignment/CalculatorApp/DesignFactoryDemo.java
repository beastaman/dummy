package CalculatorApp;

public class DesignFactoryDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,ch;
		System.out.println("Enter the num1, num2 and choice");
		System.out.println("Add : 1\nSub : 2\nMul : 3\nDiv : 4");
		num1=Read.scanner.nextInt();
		num2=Read.scanner.nextInt();
		ch=Read.scanner.nextInt();
		Arithmetic arithmetic[] = new Arithmetic[4];
		arithmetic[0] = DesignFactory.getFactory(1, num1, num2);
		arithmetic[1] = DesignFactory.getFactory(2, num1, num2);
		arithmetic[2] = DesignFactory.getFactory(3, num1, num2);
		arithmetic[3] = DesignFactory.getFactory(4, num1, num2);
		arithmetic[ch-1].calculate();
		arithmetic[ch-1].display();
	}
	
}
