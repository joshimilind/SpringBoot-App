package com.in28minutes.springboot.firstspringbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringbootProjectApplication {

	public static void main(String[] args) {

		ApplicationContext appcontext = SpringApplication.run(FirstSpringbootProjectApplication.class, args);

	}
}
