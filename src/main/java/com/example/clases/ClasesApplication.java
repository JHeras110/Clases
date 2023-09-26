package com.example.clases;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = {"com.example.controller", "com.example.services"})
public class ClasesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClasesApplication.class, args);
	}

}
