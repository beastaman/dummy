package CalulationAssignment;

public class FactoryPattern {
	
	

	public FactoryPattern(int num1,int num2,int choice) {
		super();
		Arithmetic op[] = new Arithmetic[4];
		
		op[0] = new Add();
		op[1] = new Sub();
		op[2] = new Mul();
		op[3] = new Div();
		
		op[choice].setData(num1,num2);
		op[choice].calculate();
		op[choice].display();
		
	}
//	Arithmetic a = new Add();
//	Arithmetic s = new Sub();
//	Arithmetic m = new Mul();
//	Arithmetic d = new Div();
//	
//	a.setData(1, 2);
//	a.calculate();
//	a.display();
//	
//	s.setData(1, 2);
//	s.calculate();
//	s.display();
//	
//	m.setData(1, 2);
//	m.calculate();
//	m.display();
//	
//	d.setData(1, 2);
//	d.calculate();
//	d.display();

}
