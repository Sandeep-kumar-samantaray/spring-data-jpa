package com.poc.sb.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.sb.jpa.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
