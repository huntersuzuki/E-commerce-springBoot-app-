package com.pranay.dreamshops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.pranay.dreamshops")

public class DreamshopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DreamshopsApplication.class, args);
	}

}
