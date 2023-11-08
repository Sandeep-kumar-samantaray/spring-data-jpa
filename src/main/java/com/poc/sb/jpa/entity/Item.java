package com.poc.sb.jpa.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "item")
@JsonIgnoreProperties
public class Item implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2095087905986761808L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long itemIdLong;
	
	@JsonProperty(value = "brandId")
	private String brandId;
	
	@JsonProperty(value = "itemType")
	private String itemType;
	private String itemForm;
	private String itemFormName;
	private Long requiredUnit;
	private Long unitContain;
	private Double unitPrice;
	private String billStatus;
	
	public Item() {
		super();
	}


	public Long getItemIdLong() {
		return itemIdLong;
	}


	public String getBrandId() {
		return brandId;
	}


	public String getItemType() {
		return itemType;
	}


	public String getItemForm() {
		return itemForm;
	}


	public String getItemFormName() {
		return itemFormName;
	}


	public Long getRequiredUnit() {
		return requiredUnit;
	}


	public Long getUnitContain() {
		return unitContain;
	}


	public Double getUnitPrice() {
		return unitPrice;
	}


	public String getBillStatus() {
		return billStatus;
	}


	public void setItemIdLong(Long itemIdLong) {
		this.itemIdLong = itemIdLong;
	}


	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}


	public void setItemType(String itemType) {
		this.itemType = itemType;
	}


	public void setItemForm(String itemForm) {
		this.itemForm = itemForm;
	}


	public void setItemFormName(String itemFormName) {
		this.itemFormName = itemFormName;
	}


	public void setRequiredUnit(Long requiredUnit) {
		this.requiredUnit = requiredUnit;
	}


	public void setUnitContain(Long unitContain) {
		this.unitContain = unitContain;
	}


	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}


	public Item(Long itemIdLong, String brandId, String itemType, String itemForm, String itemFormName,
			Long requiredUnit, Long unitContain, Double unitPrice, String billStatus) {
		super();
		this.itemIdLong = itemIdLong;
		this.brandId = brandId;
		this.itemType = itemType;
		this.itemForm = itemForm;
		this.itemFormName = itemFormName;
		this.requiredUnit = requiredUnit;
		this.unitContain = unitContain;
		this.unitPrice = unitPrice;
		this.billStatus = billStatus;
	}


	@Override
	public String toString() {
		return "Item [itemIdLong=" + itemIdLong + ", brandId=" + brandId + ", itemType=" + itemType + ", itemForm="
				+ itemForm + ", itemFormName=" + itemFormName + ", requiredUnit=" + requiredUnit + ", unitContain="
				+ unitContain + ", unitPrice=" + unitPrice + ", billStatus=" + billStatus + "]";
	}

	
	
}
