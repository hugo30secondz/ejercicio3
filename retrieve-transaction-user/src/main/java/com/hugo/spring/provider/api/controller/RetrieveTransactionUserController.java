package com.hugo.spring.provider.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hugo.spring.provider.api.service.ProviderImpl;
import com.hugo.spring.provider.api.entity.Transactions;

@RestController
public class RetrieveTransactionUserController {
	
	@Autowired
	ProviderImpl providerService;
	
	@GetMapping("/transactions")
	public List<Transactions> obtenerTransacciones() {
		return providerService.obtenerTransacciones();
	}
}
