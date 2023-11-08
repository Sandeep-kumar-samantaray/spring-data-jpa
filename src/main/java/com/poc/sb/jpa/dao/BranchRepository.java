package com.poc.sb.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.sb.jpa.entity.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Long>{

}
