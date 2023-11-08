package com.poc.sb.jpa.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.sb.jpa.dao.CutomerRepository;
import com.poc.sb.jpa.entity.Customer;
import com.poc.sb.jpa.service.ICustomerService;

@Service
public class CustomerService implements ICustomerService {
	
	Logger logger = LoggerFactory.getLogger(CustomerService.class);

	@Autowired
	private CutomerRepository customerRepository;
	
	@Override
	public Customer addCustomer(Customer customer) {
//		accountRepository.saveAllAndFlush(customer.getAccount());
		Customer customer2 = customerRepository.saveAndFlush(customer);
		return customer;
	}

	@Override
	public Customer findCustomerByName(String name) {
		return null;
	}
	
	@Override
	public Customer findById(Long customerID) {
		Customer customer = customerRepository.findById(customerID).get();
		return customer;
	}

	@Override
	public void deleteCustomer(Long customerId) {
		customerRepository.deleteById(customerId);
	}

	@Override
	public List<Customer> findAllCustomer() {
		List<Customer> cusList = customerRepository.findAll();
		return cusList;
	}

}
