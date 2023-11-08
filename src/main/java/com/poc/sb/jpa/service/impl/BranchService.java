package com.poc.sb.jpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.sb.jpa.dao.BranchRepository;
import com.poc.sb.jpa.entity.Branch;
import com.poc.sb.jpa.service.IBranchService;

@Service
public class BranchService implements IBranchService{

	@Autowired
	private BranchRepository branchRepository; 
	
	@Override
	public Branch getBranch(Long branchId) {
		return branchRepository.findById(branchId).get();
	}

	@Override
	public Branch saveBranch(Branch branch) {
		return branchRepository.saveAndFlush(branch);
	}

	@Override
	public void deleteBranch(Long branchId) {
		branchRepository.deleteById(branchId);
	}

}
