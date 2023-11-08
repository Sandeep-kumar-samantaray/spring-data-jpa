package com.poc.sb.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.sb.jpa.entity.Customer;
import com.poc.sb.jpa.service.ICustomerService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class CustomerController {
	
	@Autowired
	private ICustomerService customerService;
	
	@PostMapping(value = "/customer")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
		return new ResponseEntity<Customer>(customerService.addCustomer(customer) , HttpStatus.OK);
	}
	
	@GetMapping(value = "/customer/{customerId}")
	public ResponseEntity<Customer> getCustomer(@PathVariable("customerId") Long customerId){
		return new ResponseEntity<Customer>(customerService.findById(customerId) , HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/customer/{customerId}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("customerId") Long customerId){
		customerService.deleteCustomer(customerId);
		return new ResponseEntity<String>("Customer Deleted",HttpStatus.OK);
	}
	
	@GetMapping(value = "/customer")
	public ResponseEntity<List<Customer>> getAllCustomer(){
		return new ResponseEntity<List<Customer>> (customerService.findAllCustomer() , HttpStatus.OK);
	}
}
