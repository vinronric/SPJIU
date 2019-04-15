package com.vinoth.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.vinoth")
public class SpringMvcHandlerInterceptorForLoggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcHandlerInterceptorForLoggerApplication.class, args);
	}

}
