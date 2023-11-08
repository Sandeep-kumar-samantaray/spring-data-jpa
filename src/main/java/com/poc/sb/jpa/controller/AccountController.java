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

import com.poc.sb.jpa.entity.Account;
import com.poc.sb.jpa.entity.Customer;
import com.poc.sb.jpa.service.IAccountService;
import com.poc.sb.jpa.service.ICustomerService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class AccountController {
	
	@Autowired
	private IAccountService accountService;
	
	@PostMapping(value = "/account")
	public ResponseEntity<Account> saveAccount(@RequestBody Account account){
		return new ResponseEntity<Account>(accountService.addAccount(account) , HttpStatus.OK);
	}
	
	@GetMapping(value = "/account/{accountNum}")
	public ResponseEntity<Account> getAccount(@PathVariable("accountNum") Long accountNum){
		return new ResponseEntity<Account>(accountService.findById(accountNum) , HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/account/{accountNum}")
	public ResponseEntity<String> deleteAccount(@PathVariable("accountNum") Long accountNum){
		accountService.deleteById(accountNum);
		return new ResponseEntity<String>("Account deleted",HttpStatus.OK);
	}
	
	@GetMapping(value = "/account")
	public ResponseEntity<List<Account>> findAllAccount(){
		return new ResponseEntity<>(accountService.findAllAccount(), HttpStatus.OK);
	}
 
}
