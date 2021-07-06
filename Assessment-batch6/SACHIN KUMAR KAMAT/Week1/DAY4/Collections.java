package com.sapient;

interface Employee {
    public int CalculateIncomeTax();
}

class EmployeeImplement implements Employee {

    public int CalculateIncomeTax() {

        return 10;
    }

public class Collections {

	public void main(String[] args) {
		
		Employee obj = new EmployeeImplement();
		System.out.println(obj.CalculateIncomeTax());

	}

}
