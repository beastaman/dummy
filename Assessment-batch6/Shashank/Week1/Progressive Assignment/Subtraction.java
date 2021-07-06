package Assignment;



public class Subtraction extends Arithmetic {
	public Subtraction(int a , int b) {
		super(a,b);
	}
	@Override
	public void calculate() {
		this.num3 = this.num1 - this.num2;
	}

}
