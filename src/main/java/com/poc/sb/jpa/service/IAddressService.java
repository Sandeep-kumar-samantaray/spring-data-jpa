package com.poc.sb.jpa.service;

import com.poc.sb.jpa.entity.Address;

public interface IAddressService {

	public Address addAddress(Address address);
	
	public Address findAddress(Long addressId);
}
