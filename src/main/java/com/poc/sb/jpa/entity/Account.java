package com.poc.sb.jpa.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "account")
public class Account implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4570174784623360216L;

	@Id
	@SequenceGenerator(initialValue = 10000, name = "acct_id_generate_seq" , allocationSize = 100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "acct_id_generate_seq")
	private Long accountNum;
	
	private Long accountType;
	
	private Long balance;
	
	@JsonBackReference
	@ManyToOne(cascade = CascadeType.MERGE , fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_id")
	private Customer customer;


	public Account() {
		super();
	}

	
	public Account(Long accountNum, Long accountType, Long balance, Customer customer) {
		super();
		this.accountNum = accountNum;
		this.accountType = accountType;
		this.balance = balance;
		this.customer = customer;
	}


	public Long getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(Long accountNum) {
		this.accountNum = accountNum;
	}

	public Long getAccountType() {
		return accountType;
	}

	public void setAccountType(Long accountType) {
		this.accountType = accountType;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Account [accountNum=" + accountNum + ", accountType=" + accountType + ", balance=" + balance
				+ ", customer=" + customer + "]";
	}

}
