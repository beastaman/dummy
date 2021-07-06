package CalculatorApp;

public class DesignFactory {
	public static Arithmetic getFactory(int ch,int num1,int num2) {
		if(ch==1) {
			return new Add(num1,num2);
		}
		else if(ch==2) {
			return new Sub(num1,num2);
		}
		else if(ch==3) {
			return new Mul(num1,num2);
		}
		else if(ch==4) {
			return new Div(num1,num2);
		}
		return null;
	}
}
