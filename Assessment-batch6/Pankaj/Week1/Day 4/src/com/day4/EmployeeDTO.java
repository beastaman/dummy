package com.day4;

public class EmployeeDTO { //Employee Data Transferable Object
    private String fName;
    private String lName;
    private int age;
    private double salary;

    public EmployeeDTO(String fName, String lName, int age, double salary) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.salary = salary;
    }

    public EmployeeDTO() {
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
