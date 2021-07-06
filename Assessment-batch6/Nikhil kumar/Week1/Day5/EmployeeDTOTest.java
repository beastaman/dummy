package com.sapient.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeDTOTest {

    @Test
    public void checkAdd(){
        EmployeeDTO employee = new EmployeeDTO(10,"Nikhil", 22);
        assertEquals(employee.getAge(),22);
        assertEquals(employee.getName(),"Nikhil");
        assertEquals(employee.getId(),10);
    }

    @Test
    public void Update(){
        EmployeeDTO employee = new EmployeeDTO(10,"Nikhil", 22);
        employee.setAge(24);
        assertEquals(employee.getAge(),24);
    }
}