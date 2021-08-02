package com.hugo.spring.provider.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableEurekaClient
public class RetrieveTransactionUserApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(RetrieveTransactionUserApplication.class, args);
	}

}
