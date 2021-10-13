package com.ktds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MeariApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeariApplication.class, args);
	}

}
