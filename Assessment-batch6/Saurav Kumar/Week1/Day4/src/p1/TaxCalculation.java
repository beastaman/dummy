package p1;

public class TaxCalculation {
    public int calculateTax(EmployeeTo emp) {
        return emp.getSalary()*10/100;
    }
}
