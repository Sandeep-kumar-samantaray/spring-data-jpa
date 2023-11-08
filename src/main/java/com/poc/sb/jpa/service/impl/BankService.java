package com.poc.sb.jpa.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.sb.jpa.dao.BankRepository;
import com.poc.sb.jpa.entity.Bank;
import com.poc.sb.jpa.service.IBankService;

@Service
public class BankService implements IBankService {
	
	Logger logger = LoggerFactory.getLogger(BankService.class);

	@Autowired
	private BankRepository bankRepository;
	
	@Override
	public Bank saveBank(Bank bank) {
		Bank bank2 = bankRepository.saveAndFlush(bank);
		logger.info("afer persist | object - {} ",bank2.toString());
		return bank2;
	}
	
	@Override
	public Bank findbank(Long bankCode) {
		Bank bank = bankRepository.findByBankCode(bankCode);
		System.out.println(bank.getName());
		System.out.println(bank.getAddress());
		return bank;
	}

	@Override
	public void deletebank(Long bankId) {
		bankRepository.deleteById(bankId);
	}

}
