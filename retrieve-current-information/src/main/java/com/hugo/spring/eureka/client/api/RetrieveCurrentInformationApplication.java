package com.hugo.spring.eureka.client.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hugo.spring.eureka.client.api.feign.UserClient;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableFeignClients
public class RetrieveCurrentInformationApplication {

	@Autowired
	private UserClient userClient;
	
	@GetMapping("/hola")
	public String getHola() {
		return userClient.response();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(RetrieveCurrentInformationApplication.class, args);
	}

}
