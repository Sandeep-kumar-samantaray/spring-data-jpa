package com.poc.sb.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.sb.jpa.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
