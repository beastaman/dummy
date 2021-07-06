package com.to;

public class Customer {
	private int customerId;
	public String customerName;
	public String customerNumber;
	public String customerAddress;
	public String email;
	public String password;
	
	public Customer( String customerName, String customerNumber, String customerAddress, String email,
			String password) {
		super();
		
		this.customerName = customerName;
		this.customerNumber = customerNumber;
		this.customerAddress = customerAddress;
		this.email = email;
		this.password = password;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerNumber="
				+ customerNumber + ", customerAddress=" + customerAddress + ", email=" + email + ", password="
				+ password + "]";
	}
	

}
