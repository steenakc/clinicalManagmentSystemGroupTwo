package com.faith.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ClinicalMangmentSystemAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicalMangmentSystemAngularApplication.class, args);
		System.out.println("Project starts here....");
	}

}
