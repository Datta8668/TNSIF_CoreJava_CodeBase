package com.tnsif.day4.first;

public class Customer {

	private String customerName;
	private int customerId;
	private String customerCity;
	
	
//	default constructor
	public Customer() {
		System.out.println("Hello this is Default Constructor-------!");
	}


//	Parameter Constructor
	public Customer(String customerName, int customerId, String customerCity) {
//		this();  //calling default constructor
		
		System.out.println("Hello this is an Parameterized constructor------!");
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}

//	Getter Setter Method
	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerCity() {
		return customerCity;
	}


	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

      //to string
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
				+ customerCity + "]";
	}
	
	
}