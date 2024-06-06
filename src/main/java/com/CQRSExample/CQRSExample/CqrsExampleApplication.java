package com.CQRSExample.CQRSExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class CqrsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CqrsExampleApplication.class, args);
	}

}
