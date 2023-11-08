package com.poc.sb.jpa.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "bank")
public class Bank implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2150885546746929794L;

	@Id
	@SequenceGenerator(name = "bank_code_generate" , initialValue = 1000,allocationSize = 100)
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "bank_code_generate")
	private Long bankCode;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY , targetEntity = Address.class)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	@JoinColumn(name = "address_id_fk")
	private Address address;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "bank")
	@JsonIgnore
	private List<Branch> branchs;

	public Bank() {

	}


	public Bank(Long bankCode, String name, Address address, List<Branch> branchs) {
		super();
		this.bankCode = bankCode;
		this.name = name;
		this.address = address;
		this.branchs = branchs;
	}


	public Long getBankCode() {
		return bankCode;
	}

	public void setBankCode(Long bankCode) {
		this.bankCode = bankCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	public List<Branch> getBranchs() {
		return branchs;
	}


	public void setBranchs(List<Branch> branchs) {
		this.branchs = branchs;
	}

}
