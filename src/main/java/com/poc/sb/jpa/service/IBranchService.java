package com.poc.sb.jpa.service;

import com.poc.sb.jpa.entity.Branch;

public interface IBranchService {

	public Branch getBranch(Long branchId);
	
	public Branch saveBranch(Branch branch);
	
	public void deleteBranch(Long branchId);
}
