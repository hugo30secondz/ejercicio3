package com.hugo.spring.provider.api.dao;


import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hugo.spring.provider.api.entity.Transactions;

//@Repository("transactionDAO")
public interface TransactionDAO extends MongoRepository<Transactions, String> {
	
	/*@Query("all")
	public List<Transactions> obtenerTransacciones();*/
	
	//Optional<Transactions> findByCustomerId(long i);
	
	
}
