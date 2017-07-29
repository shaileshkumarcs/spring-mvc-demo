package com.shailesh.springdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shailesh.springdemo.dao.CustomerDAO;
import com.shailesh.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	//new to inject customer dao
	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {

		return customerDAO.getCustomers();
	}

}
