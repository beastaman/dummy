package com.sapient;

public class TaxCalculation {

    public int calculateTax(EmployeeTO emp) {

        return emp.getSalary() * 10 / 100;

    }

}
