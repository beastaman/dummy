package p1;

public class TaxCalculator {

	public double calculateTax(EmployeeTO emp) {
		return emp.getSalary()*0.1;
	}

}
