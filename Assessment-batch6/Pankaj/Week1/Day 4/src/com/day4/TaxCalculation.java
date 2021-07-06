package com.day4;

public class TaxCalculation {
    public double calculateTax(EmployeeDTO employee){
        return employee.getSalary()*0.1;
    }
}
