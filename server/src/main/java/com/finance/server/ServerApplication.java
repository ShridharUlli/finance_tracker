package com.finance.server;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;


@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	public CommandLineRunner testConnection(DataSource dataSource) {
		return args -> {
			System.out.println("👉 DataSource class: " + dataSource.getClass().getName());
			System.out.println("👉 DB URL: " + dataSource.getConnection().getMetaData().getURL());
		};
	}

}
