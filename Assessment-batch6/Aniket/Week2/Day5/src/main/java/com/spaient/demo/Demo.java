package com.spaient.demo;

import com.spaient.dao.BranchTableDAO;
import com.spaient.dao.CustomerDAO;
import com.spaient.entity.BranchTable;
import com.spaient.entity.Customer;

import java.sql.SQLException;

public class Demo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        BranchTable branchTable = new BranchTableDAO().getFreeTableById(1);
        System.out.println(branchTable);
    }
}