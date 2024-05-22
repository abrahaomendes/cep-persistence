package com.example.ceppersist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CepPersistApplication {

	public static void main(String[] args) {
		SpringApplication.run(CepPersistApplication.class, args);
	}

}
