package com.codeclan.example.paintzServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class PaintzServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaintzServerApplication.class, args);
	}

}
