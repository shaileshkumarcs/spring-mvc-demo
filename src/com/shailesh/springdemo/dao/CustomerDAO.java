package com.shailesh.springdemo.dao;

import java.util.List;

import com.shailesh.springdemo.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

}
