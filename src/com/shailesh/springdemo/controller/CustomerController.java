package com.shailesh.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shailesh.springdemo.entity.Customer;
import com.shailesh.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// need to inject customer Service
	@Autowired
	private CustomerService customerService;
	

	@GetMapping("/list")
	public String listCustomer(Model theModel){
		
		// get customers from the dao
		List<Customer> theCustomers = customerService.getCustomers();
		
		//add the customers to the model
		theModel.addAttribute("customers",theCustomers);
		
		return "list-customer";
	}
}
