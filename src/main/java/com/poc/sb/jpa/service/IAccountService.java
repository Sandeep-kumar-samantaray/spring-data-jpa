package com.poc.sb.jpa.service;

import java.util.List;

import com.poc.sb.jpa.entity.Account;

public interface IAccountService {

	public Account addAccount(Account customer);

	public Account findById(Long accountNum);
	
	public void deleteById(Long accountNum);

	public List<Account> findAllAccount();
	
}
