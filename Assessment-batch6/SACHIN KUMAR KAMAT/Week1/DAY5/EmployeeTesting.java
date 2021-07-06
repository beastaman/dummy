package week1day5;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTesting {

    @Test
    public void Emptest1() {
        EmployeeTO employeeTO = new EmployeeTO(1, "userf1", "userl1", 25, 56000);
        assertEquals("user1", employeeTO.getFname());
    }

    @Test
    public void Emptest2() {
        EmployeeTO employeeTO = new EmployeeTO(1, "userf2", "userl2", 21, 66000);
        assertEquals("userl2", employeeTO.getLname());
    }

    @Test
    public void Emptest3() {
        EmployeeTO employeeTO = new EmployeeTO(1, "userf3", "userl3", 22, 87000);
        assertEquals(22, employeeTO.getAge());
    }

    @Test
    public void Emptest4() {
        EmployeeTO employeeTO = new EmployeeTO(1, "userf4", "userl4", 24, 55000);
        assertEquals(56000, employeeTO.getSalary());
    }

    @Test
    public void Demo4Test() {
        ExceptionExample example = new ExceptionExample();
        assertEquals("Transaction is under process", example.func1());
    }

    @Test
    public void Demo4Test1() {
        ExceptionExample example = new ExceptionExample();
        assertEquals("Amount should be greater than zero!", example.func1());
    }

}