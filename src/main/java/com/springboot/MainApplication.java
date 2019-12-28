package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = { "com.springboot" })
public class MainApplication {

	public static void main(String[] args) {
		System.out.println("I am creating first Springboot application.");
		SpringApplication.run(MainApplication.class, args);

	}

}
