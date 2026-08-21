package com.JDBC2.SpringBootJDBC;

import com.JDBC2.SpringBootJDBC.Model.Alien;
import com.JDBC2.SpringBootJDBC.Repo.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);

		//Saving to db
		AlienRepo repo = context.getBean(AlienRepo.class);
		System.out.println(repo.findAll());

	}
}
