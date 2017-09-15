package com.example.springbootsamplemysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
public class SpringBootSampleMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSampleMysqlApplication.class, args);
	}
}
