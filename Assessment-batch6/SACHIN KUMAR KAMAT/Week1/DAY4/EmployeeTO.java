package com.sapient;

public class EmployeeTO {

    private int Age;
    private String Fname;
    private String Lname;
    private int Salary;

    public EmployeeTO() {
        super();

    }

    /**
     * @param age
     * @param fname  CONSTRUCTOR
     * @param lname
     * @param salary
     */
    public EmployeeTO(int Age, String Fname, String Lname, int Salary) {
        super();
        this.Age = Age;
        this.Fname = Fname;
        this.Lname = Lname;
        this.Salary = Salary;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return "EmployeeTO [age=" + Age + ", fname=" + Fname + ", lname=" + Lname + ", salary=" + Salary + ", getAge()="
                + getAge() + ", getFname()=" + getFname() + ", getLname()=" + getLname() + ", getSalary()="
                + getSalary() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }

}
