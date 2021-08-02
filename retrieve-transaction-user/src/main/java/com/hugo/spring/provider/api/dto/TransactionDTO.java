package com.hugo.spring.provider.api.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionDTO {

	private String transactionType;
	
	private String description;
	
	private String date;
	
	private float amount;
}
