package com.poc.sb.jpa.service;

import com.poc.sb.jpa.entity.Bank;

public interface IBankService {

	public Bank findbank(Long bankId);
	
	public Bank saveBank(Bank bank);
	
	public void deletebank(Long bankId);
}
