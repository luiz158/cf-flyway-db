	package com.lukeshannon;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CfFlywayDbApplication {
	
	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(CfFlywayDbApplication.class, args);
	}
}
