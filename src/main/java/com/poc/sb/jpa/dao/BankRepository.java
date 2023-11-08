package com.poc.sb.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.poc.sb.jpa.entity.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long>{

	@Query(value = "select * from bank where bank_code =:bankCode " , nativeQuery = true)
	public Bank findByBankCode(@Param("bankCode") Long bankCode);

}
