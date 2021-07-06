package assignment.sapient.week1.q1.logic;

public class Div extends Arithmetic {

	@Override
	public void calculate() throws DivideByZeroException {
		
		if(this.num2==0) {
			throw new DivideByZeroException();
		}
		
		this.num3 = 1.0*this.num1/this.num2;
		this.num3 = Math.round(this.num3*100)/100.0;
		
	}

}
