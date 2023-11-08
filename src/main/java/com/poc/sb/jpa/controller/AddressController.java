package com.poc.sb.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.sb.jpa.entity.Address;
import com.poc.sb.jpa.service.IAddressService;

@RestController
public class AddressController {
	
	@Autowired
	private IAddressService addressService;
	
	@PostMapping(value = "/address")
	public ResponseEntity<Address> saveAddress(@RequestBody Address address){
		return new ResponseEntity<Address>(addressService.addAddress(address) , HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/address/{addressId}")
	public ResponseEntity<Address> findAddress(@PathVariable("addressId") Long addressId){
		return new ResponseEntity<Address>(addressService.findAddress(addressId), HttpStatus.OK);
	}

}
