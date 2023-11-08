package com.poc.sb.jpa.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "customer")
public class Customer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4824813166891411825L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cust_id")
	private Long id;
	
	private String name;
	
	private Long phoneNum;
	
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.MERGE, mappedBy = "customer" , fetch = FetchType.LAZY)
	private List<Account> account = new ArrayList<>();

	@JsonManagedReference
	@OneToMany(cascade = CascadeType.MERGE, mappedBy = "customerAddress" , fetch = FetchType.LAZY)
	private List<Address> address = new ArrayList<>();

	public Customer() {
		super();
	}

	public Customer(Long id, String name, Long phoneNum, List<Account> account) {
		this.id = id;
		this.name = name;
		this.phoneNum = phoneNum;
		this.account = account;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"id=" + id +
				", name='" + name + '\'' +
				", phoneNum=" + phoneNum +
				", account=" + account +
				'}';
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(Long phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}

}
