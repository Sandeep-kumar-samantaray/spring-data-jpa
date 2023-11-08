package com.poc.sb.jpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.sb.jpa.dao.AddressRepository;
import com.poc.sb.jpa.entity.Address;
import com.poc.sb.jpa.service.IAddressService;

@Service
public class AddressService implements IAddressService{

	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public Address addAddress(Address address) {
		return addressRepository.saveAndFlush(address);
	}

	@Override
	public Address findAddress(Long addressId) {
		return addressRepository.findById(addressId).get();
	}

}
