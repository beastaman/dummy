package Assignment;



public class Multiplication extends Arithmetic {
	public Multiplication(int a , int b) {
		super(a,b);
	}
@Override
		public void calculate() {
			this.num3 = this.num1 * this.num2;
	}
}
