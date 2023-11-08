package com.poc.sb.jpa.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.sb.jpa.dao.AccountRepository;
import com.poc.sb.jpa.dao.CutomerRepository;
import com.poc.sb.jpa.entity.Account;
import com.poc.sb.jpa.entity.Customer;
import com.poc.sb.jpa.service.IAccountService;
import com.poc.sb.jpa.service.ICustomerService;

@Service
public class AccountService implements IAccountService {
	
	Logger logger = LoggerFactory.getLogger(AccountService.class);

	@Autowired
	private AccountRepository accountRepository;

	@Override
	public Account addAccount(Account account) {
		logger.info("Request | data - {}",account);
		return accountRepository.saveAndFlush(account);
	}

	@Override
	public Account findById(Long accountNum) {
		return accountRepository.findById(accountNum).get();
	}

	@Override
	public void deleteById(Long accountNum) {
		accountRepository.deleteById(accountNum);
	}

	@Override
	public List<Account> findAllAccount() {
		List<Account> accList = accountRepository.findAll();
		return accList;
	}

}
