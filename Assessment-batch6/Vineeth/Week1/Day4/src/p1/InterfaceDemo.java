package p1;

interface Employee {
	public int calculateTax();
}

class EmployeeImplement implements Employee {
	@Override
	public int calculateTax() {
		return 10;
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {

		Employee emp = new EmployeeImplement();
		System.out.println(emp.calculateTax());
	}

}
