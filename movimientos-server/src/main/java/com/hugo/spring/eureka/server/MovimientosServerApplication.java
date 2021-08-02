package com.hugo.spring.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MovimientosServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovimientosServerApplication.class, args);
	}

}
