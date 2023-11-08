package com.poc.sb.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.sb.jpa.dao.ItemRepository;
import com.poc.sb.jpa.entity.Item;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ItemController {
	
	@Autowired
	private ItemRepository accountService;
	
	@PostMapping(value = "/item" ,consumes = MediaType.APPLICATION_JSON_VALUE , 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Item> saveAccount(@RequestBody Item item){
		System.out.println("item details " +item.toString());
		return new ResponseEntity<Item>(accountService.saveAndFlush(item) , HttpStatus.CREATED);
	}
 
}
