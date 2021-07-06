package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

import com.constant.Constant;
import com.to.Customer;

public class CustomerDAO {
	public List<Customer> getAllCustomers() throws Exception
	{
		List<Customer> customers = new ArrayList<Customer>();
		Connection connection= Connectivity.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(Constant.GET_ALL_CUSTOMERS );
		ResultSet resultSet  = preparedStatement.executeQuery();
		while(resultSet.next()) {
			customers.add(new Customer(resultSet.getInt(1) ,resultSet.getString(2),resultSet.getString(3)
					, resultSet.getString(4), resultSet.getString(5), resultSet.getString(6),resultSet.getString(7)));
		}
		return customers;
	}
	public Customer getCustomerByEmail(String email) throws Exception
	{
		Customer customer = new Customer();
		Connection connection= Connectivity.getConnection();
	
		PreparedStatement preparedStatement = connection.prepareStatement(Constant.GET_CUSTOMER_BY_EMAIL);
		preparedStatement.setString(1, email);
		ResultSet resultSet  = preparedStatement.executeQuery();
		if(resultSet.next()) {
			customer =new Customer(resultSet.getInt(1) ,resultSet.getString(2),resultSet.getString(3)
					, resultSet.getString(4), resultSet.getString(5), resultSet.getString(6),resultSet.getString(7));
		}
		else
		{
			throw new Exception("User does not exist");
		}
		return customer;
	}
	
	
//	public boolean insertCustomerData(Customer Customer) throws Exception
//	{
//		Connection connection= Connectivity.getConnection();
//		
//		PreparedStatement preparedStatement = connection.prepareStatement(Constants.INSERT_Customer_DATA );
//		preparedStatement.setString(1, Customer.getId());
//		preparedStatement.setString(2, Customer.getFname() );
//		preparedStatement.setString(3, Customer.getLname() );
//		preparedStatement.setString(4, Customer.getDob() );
//		preparedStatement.setString(5, Customer.getArea() );
//		
//		return preparedStatement.executeUpdate() > 0 ;
//		
//	}
//	public boolean updateCustomerArea(String id,String area) throws Exception
//	{
//		Connection connection= Connectivity.getConnection();
//		String query = " UPDATE Customers SET area=? where id=?";
//		PreparedStatement preparedStatement = connection.prepareStatement(query);
//		preparedStatement.setString(1,area);
//		preparedStatement.setString(2, id );		
//		return preparedStatement.executeUpdate() > 0 ;
//		
//	}
	
	public boolean deleteCustomer(String id) throws Exception
	{
		Connection connection= Connectivity.getConnection();
		String query = " DELETE from Customers where id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, id );		
		return preparedStatement.executeUpdate() > 0 ;
	}
	
	public void joinTwoTables() throws Exception
	{
		Connection connection= Connectivity.getConnection();	
		String query = "SELECT * FROM Customers natural join marks ";
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
//		preparedStatement.setString(1,table1);
//		preparedStatement.setString(2, table2);
		ResultSet resultSet  = preparedStatement.executeQuery();
		ResultSetMetaData rsmd = resultSet.getMetaData();
	      int column_count = rsmd.getColumnCount();
		while(resultSet.next()) {
			for(int i=1;i<=column_count;++i)
			{
				System.out.print(resultSet.getString(i)+"\t");
			}
			System.out.println();
		}
	}
}
