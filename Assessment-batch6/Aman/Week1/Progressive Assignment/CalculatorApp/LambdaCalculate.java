package CalculatorApp;

public class LambdaCalculate {
	public static double fun(double a,double b,Calculate calculate) {
		return calculate.cal(a,b);
	}
	public static void main(String[] args) {
		int num1,num2,ch;
		System.out.println("Enter the num1, num2 and choice");
		System.out.println("Add : 1\nSub : 2\nMul : 3\nDiv : 4");
		num1=Read.scanner.nextInt();
		num2=Read.scanner.nextInt();
		ch=Read.scanner.nextInt();
		double arr[] =new double[4];
		arr[0]=fun(num1,num2,(a,b)->(a+b));
		arr[1]=fun(num1,num2,(a,b)->(a-b));
		arr[2]=fun(num1,num2,(a,b)->(a*b));
		arr[3]=fun(num1,num2,(a,b)->(a/b));
		System.out.println(arr[ch-1]);
	}
}
