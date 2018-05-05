package com.kongxiang.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//开启事务
@EnableTransactionManagement
public class SpringBootRwApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRwApplication.class, args);
	}
}
