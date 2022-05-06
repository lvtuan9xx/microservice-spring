package com.vn.jacobi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class JacobiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JacobiApplication.class, args);
	}

}
