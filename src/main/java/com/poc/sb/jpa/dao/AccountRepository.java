package com.poc.sb.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.sb.jpa.entity.Account;
import com.poc.sb.jpa.entity.Customer;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

}
