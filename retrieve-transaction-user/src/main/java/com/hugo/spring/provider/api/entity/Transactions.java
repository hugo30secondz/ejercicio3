package com.hugo.spring.provider.api.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

//import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/*@Getter
@Setter
@AllArgsConstructor*/
@Document(collection = "Transactions")
public class Transactions{
	
	@Id
	private String _id;
	
	//@Field("customerId")
	private Long customerId;
	
	//@Field("date")
	private String date;
	
	//@Field("transactionDescription")
	TransactionDescription transactionDescription;
	//Object transactionDescription;
	
	Transactions(){}

	public Transactions(String _id, Long customerId, String date, TransactionDescription transactionDescription) {
		super();
		this._id = _id;
		this.customerId = customerId;
		this.date = date;
		this.transactionDescription = transactionDescription;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public TransactionDescription getTransactionDescription() {
		return transactionDescription;
	}

	public void setTransactionDescription(TransactionDescription transactionDescription) {
		this.transactionDescription = transactionDescription;
	}

	@Override
	public String toString() {
		return "Transactions [_id=" + _id + ", customerId=" + customerId + ", date=" + date
				+ ", transactionDescription=" + transactionDescription + "]";
	}
	
	
}
