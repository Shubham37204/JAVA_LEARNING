package com.Ranjana.SpringBoot2_Learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.Ranjana.SpringBoot2_Learning.service.UserService;

@SpringBootApplication
public class SpringBoot2LearningApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctxt=
		SpringApplication.run(SpringBoot2LearningApplication.class, args);
		UserService us = ctxt.getBean(UserService.class);
		us.registerUser("admin","admin","admin");
	}

}
