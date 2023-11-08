package com.poc.sb.jpa.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "address")
public class Address  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6854699671351887019L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String lineName;
	private String city;
	private String state;
	private Long zipCode;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "address")
	private Bank bank;

	@JsonBackReference
	@ManyToOne(cascade = CascadeType.MERGE , fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_id")
	private Customer customerAddress;

	public Address() {
		super();
	}

	public Address(Long id, String lineName, String city, String state, Long zipCode, Bank bank ) {
		this.id = id;
		this.lineName = lineName;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.bank = bank;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLineName() {
		return lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getZipCode() {
		return zipCode;
	}
	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", lineName=" + lineName + ", city=" + city + ", state=" + state + ", zipCode="
				+ zipCode + "]";
	}
	
	
}
