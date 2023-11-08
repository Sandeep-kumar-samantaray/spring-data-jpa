package com.poc.sb.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.sb.jpa.entity.Bank;
import com.poc.sb.jpa.service.IBankService;

@RestController
public class BankController {
	
	@Autowired
	private IBankService bankService;
	
	@PostMapping(value = "/bank")
	public ResponseEntity<Bank> addbank(@RequestBody Bank bank){
		return new ResponseEntity<Bank>(bankService.saveBank(bank) , HttpStatus.OK);
	}
	
	@GetMapping(value = "/bank/{bankCode}")
	public ResponseEntity<Bank> getBank(@PathVariable("bankCode") Long bankCode){
		return new ResponseEntity<Bank>(bankService.findbank(bankCode) , HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/bank/{bankCode}")
	public ResponseEntity<String> deleteBank(@PathVariable("bankCode") Long bankCode){
		bankService.deletebank(bankCode);
		return new ResponseEntity<String>( "bank Deleted", HttpStatus.OK);
	}

}
