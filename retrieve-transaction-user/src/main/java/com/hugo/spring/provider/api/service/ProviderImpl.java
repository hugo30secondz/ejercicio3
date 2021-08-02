package com.hugo.spring.provider.api.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import com.hugo.spring.provider.api.dao.TransactionDAO;
import com.hugo.spring.provider.api.entity.Transactions;

import lombok.extern.slf4j.Slf4j;

@Service
//@EnableMongoRepositories(basePackages = {"com.hugo.spring.provider.api.dao"})
public class ProviderImpl implements ProviderI {

	@Autowired
	TransactionDAO transactionDAO;
	
	@Override
	public List<Transactions> obtenerTransacciones() {
		// TODO Auto-generated method stub
		List<Transactions> response = transactionDAO.findAll();
		//log.info("informacion recibida de bade datos {}",response.get(0).getDate());
		return response;
	}

}
