package com.hugo.spring.provider.api.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/*@Getter
@Setter
@AllArgsConstructor*/

public class TransactionDescription {
	
	//@Field("TransactionType")
	private String TransactionType;
	
	//@Field("Descripcion")
	private String Descripcion;
	
	//@Field("amount")
	private float amount;

	TransactionDescription(){}

	public TransactionDescription(String transactionType, String descripcion, float amount) {
		TransactionType = transactionType;
		Descripcion = descripcion;
		this.amount = amount;
	}



	public String getTransactionType() {
		return TransactionType;
	}

	public void setTransactionType(String transactionType) {
		TransactionType = transactionType;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "TransactionDescription [TransactionType=" + TransactionType + ", Descripcion=" + Descripcion
				+ ", amount=" + amount + "]";
	}
	
}
