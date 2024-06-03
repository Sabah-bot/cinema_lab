package com.example.cinema_lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class CinemaLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemaLabApplication.class, args);
	}

}
