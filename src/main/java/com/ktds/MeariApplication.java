package com.ktds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"com.ktds.domain.repository.BoardRepository"})
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MeariApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeariApplication.class, args);
	}

}
