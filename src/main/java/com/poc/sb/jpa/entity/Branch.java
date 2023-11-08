package com.poc.sb.jpa.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "branch")
public class Branch implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2519813919174192653L;

	@Id
	@Column(name = "branch_code")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long branchCode;
	
	private String branchName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bank_code")
	private Bank bank;

	
	public Branch() {
		super();
	}


	public Branch(Long branchCode, String branchName, Bank bank) {
		super();
		this.branchCode = branchCode;
		this.branchName = branchName;
		this.bank = bank;
	}


	public Long getBranchCode() {
		return branchCode;
	}


	public void setBranchCode(Long branchCode) {
		this.branchCode = branchCode;
	}


	public String getBranchName() {
		return branchName;
	}


	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}


	public Bank getBank() {
		return bank;
	}


	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	
}
