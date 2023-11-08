package com.poc.sb.jpa.service;

import java.util.List;

import com.poc.sb.jpa.entity.Customer;

public interface ICustomerService {

	public Customer addCustomer(Customer customer);
	
	public Customer findCustomerByName(String name);
	
	public Customer findById(Long customerID);
	
	public void deleteCustomer(Long customerId);

	public List<Customer> findAllCustomer();
	
}
