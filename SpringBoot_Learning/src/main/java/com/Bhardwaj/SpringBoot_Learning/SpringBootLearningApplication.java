package com.Bhardwaj.SpringBoot_Learning;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringBootLearningApplication {
	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringBootLearningApplication.class, args);
		Dev obj = context.getBean(Dev.class);
		obj.code();
	}
}
