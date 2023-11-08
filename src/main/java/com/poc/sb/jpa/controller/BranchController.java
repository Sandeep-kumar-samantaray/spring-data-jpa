package com.poc.sb.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.sb.jpa.entity.Branch;
import com.poc.sb.jpa.service.IBranchService;

@RestController
public class BranchController {
	
	@Autowired
	private IBranchService branchService;
	
	@PostMapping(value = "/branch")
	public ResponseEntity<Branch> addbranch(@RequestBody Branch branch){
		return new ResponseEntity<Branch>(branchService.saveBranch(branch) , HttpStatus.OK);
	}
	
	@GetMapping(value = "/branch/{branchCode}")
	public ResponseEntity<Branch> getbranch(@PathVariable("branchCode") Long branchCode){
		return new ResponseEntity<Branch>(branchService.getBranch(branchCode) , HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/branch/{branchCode}")
	public ResponseEntity<String> deleteBranch(@PathVariable("branchCode") Long branchCode){
		branchService.deleteBranch(branchCode);
		return new ResponseEntity<String>( "branch Deleted", HttpStatus.OK);
	}

}
