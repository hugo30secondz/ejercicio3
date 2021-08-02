package com.hugo.spring.eureka.client.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url="localhost:8888",name="RETRIEVE-TRANSACTION")
public interface UserClient {

	@GetMapping("/transactions")
	public String response();
}
